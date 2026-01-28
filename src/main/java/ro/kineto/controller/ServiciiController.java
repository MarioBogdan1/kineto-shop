package ro.kineto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.kineto.service.ServiciuService;
import jakarta.servlet.http.HttpSession;

@Controller
public class ServiciiController {

    private final ServiciuService serviciuService;

    public ServiciiController(ServiciuService serviciuService) {
        this.serviciuService = serviciuService;
    }

    @GetMapping("/servicii")
    public String servicii(Model model, HttpSession session) {
        model.addAttribute("servicii", serviciuService.getToateServiciile());
        model.addAttribute("userEmail", session.getAttribute("userEmail"));
        return "servicii";
    }
}

