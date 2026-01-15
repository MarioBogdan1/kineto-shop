package ro.kineto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.kineto.service.ProdusService;

/**
 * Controller pentru paginile principale ale site-ului
 */
@Controller
public class HomeController {
    
    private final ProdusService produsService;
    
    // Injectare dependință prin constructor
    public HomeController(ProdusService produsService) {
        this.produsService = produsService;
    }
    
    /**
     * Pagina principală - afișează toate produsele
     */
    @GetMapping("/")
    public String home(Model model) {
        // Adaugă lista de produse în model pentru Thymeleaf
        model.addAttribute("produse", produsService.getToateProdusele());
        return "index"; // Returnează template-ul index.html
    }
}
