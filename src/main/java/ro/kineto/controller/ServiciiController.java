package ro.kineto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.kineto.service.ServiciuService;

@Controller
public class ServiciiController {

    private final ServiciuService serviciuService;

    public ServiciiController(ServiciuService serviciuService) {
        this.serviciuService = serviciuService;
    }

    @GetMapping("/servicii")
    public String servicii(Model model) {
        model.addAttribute("servicii", serviciuService.getToateServiciile());
        return "servicii";
    }
}

