package ro.kineto.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ro.kineto.service.ProdusService;
import ro.kineto.service.ServiciuService;

@Controller
public class HomeController {

    private final ProdusService produsService;
    private final ServiciuService serviciuService;

    public HomeController(ProdusService produsService, ServiciuService serviciuService) {
        this.produsService = produsService;
        this.serviciuService = serviciuService;
    }

    // 👉 disponibil automat în TOATE paginile (login / logout / navbar)
    @ModelAttribute
    public void addUserEmailToModel(Model model, HttpSession session) {
        model.addAttribute("userEmail", session.getAttribute("userEmail"));
    }

    // 🏠 Home
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("produse", produsService.getToateProdusele());
        model.addAttribute("servicii", serviciuService.getToateServiciile());
        return "index";
    }

    // 🔐 Pagina login
    @GetMapping("/login")
    public String loginPage(HttpSession session) {
        if (session.getAttribute("userEmail") != null) {
            return "redirect:/";
        }
        return "login";
    }

    // 🔐 Procesare login
    @PostMapping("/login")
    public String processLogin(
            @RequestParam String email,
            HttpSession session,
            RedirectAttributes redirectAttributes) {

        if (email == null || email.isBlank() || !email.contains("@")) {
            redirectAttributes.addFlashAttribute("error", "Email invalid");
            return "redirect:/login";
        }

        session.setAttribute("userEmail", email.trim());
        redirectAttributes.addFlashAttribute("success", "Bine ai venit!");
        return "redirect:/";
    }

    // 🚪 Logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
