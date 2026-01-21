package ro.kineto.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ro.kineto.service.ProdusService;

@Controller
public class HomeController {

    private final ProdusService produsService;

    public HomeController(ProdusService produsService) {
        this.produsService = produsService;
    }

    // 🔹 Asta pune automat userEmail în TOATE paginile
    @ModelAttribute
    public void addUserEmail(Model model, HttpSession session) {
        model.addAttribute("userEmail", session.getAttribute("userEmail"));
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("produse", produsService.getToateProdusele());
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(HttpSession session) {
        if (session.getAttribute("userEmail") != null) {
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String email,
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

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
