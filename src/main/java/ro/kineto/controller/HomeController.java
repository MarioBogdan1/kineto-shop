package ro.kineto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ro.kineto.model.Produs;
import ro.kineto.service.ProdusService;
import ro.kineto.service.ServiciuService;

import jakarta.servlet.http.HttpSession;
import java.util.Optional;

/**
 * Controller pentru paginile principale ale site-ului
 */
@Controller
public class HomeController {
    
    private final ProdusService produsService;
    private final ServiciuService serviciuService;
    
    public HomeController(ProdusService produsService, ServiciuService serviciuService) {
        this.produsService = produsService;
        this.serviciuService = serviciuService;
    }
    
    /**
     * Pagina principală - afișează toate produsele
     */
    @GetMapping("/")
    public String home(Model model, HttpSession session) {
        model.addAttribute("produse", produsService.getToateProdusele());
        model.addAttribute("userEmail", session.getAttribute("userEmail"));
        return "index";
    }
    
    /**
     * Pagina de detalii produs
     */
    @GetMapping("/produs/{id}")
    public String detaliiProdus(@PathVariable Long id, Model model, HttpSession session) {
        Optional<Produs> produs = produsService.getProdusById(id);
        
        if (produs.isPresent()) {
            model.addAttribute("produs", produs.get());
            model.addAttribute("userEmail", session.getAttribute("userEmail"));
            return "produs-detalii";
        }
        
        return "redirect:/";
    }
    
    /**
     * Pagina de login
     */
    @GetMapping("/login")
    public String loginPage(Model model, HttpSession session) {
        // Dacă utilizatorul e deja logat, redirecționează la home
        if (session.getAttribute("userEmail") != null) {
            return "redirect:/";
        }
        return "login";
    }
    
    /**
     * Procesare login
     */
    @PostMapping("/login")
    public String processLogin(@RequestParam String email, 
                               HttpSession session,
                               RedirectAttributes redirectAttributes) {
        // Validare email simplă
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            redirectAttributes.addFlashAttribute("error", "Vă rugăm introduceți un email valid.");
            return "redirect:/login";
        }
        
        // Salvează email-ul în sesiune
        session.setAttribute("userEmail", email.trim());
        redirectAttributes.addFlashAttribute("success", "Bine ai venit!");
        
        return "redirect:/";
    }
    
    /**
     * Logout
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("userEmail");
        return "redirect:/";
    }
    
    /**
     * Pagina Servicii
     */
//     @GetMapping("/servicii")
//     public String servicii(Model model, HttpSession session) {
//         model.addAttribute("servicii", serviciuService.getToateServiciile());
//         model.addAttribute("userEmail", session.getAttribute("userEmail"));
//         return "servicii";
//     }
 }
