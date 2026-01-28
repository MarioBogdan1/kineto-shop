package ro.kineto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.kineto.model.CabinetMedical;
import ro.kineto.service.CabinetMedicalService;

import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Controller pentru pagina Cabinete Medicale
 * Afișează cabinete medicale de kinetoterapie din diverse orașe
 */
@Controller
public class CabineteController {
    
    private final CabinetMedicalService cabinetService;
    
    public CabineteController(CabinetMedicalService cabinetService) {
        this.cabinetService = cabinetService;
    }
    
    /**
     * Pagina Cabinete Medicale
     * Afișează cabinete grupate pe oraș
     */
    @GetMapping("/cabinete")
    public String cabinete(Model model, HttpSession session) {
        // Obține toate cabinetele
        List<CabinetMedical> toateCabinetele = cabinetService.getToateCabinetele();
        
        // Grupează cabinetele pe oraș
        Map<String, List<CabinetMedical>> cabinetePeOras = toateCabinetele.stream()
            .collect(Collectors.groupingBy(CabinetMedical::getOras));
        
        // Obține lista de orașe în ordine
        List<String> orase = cabinetService.getOrase();
        
        // Adaugă datele în model
        model.addAttribute("cabinetePeOras", cabinetePeOras);
        model.addAttribute("orase", orase);
        model.addAttribute("toateCabinetele", toateCabinetele);
        model.addAttribute("userEmail", session.getAttribute("userEmail"));
        
        return "cabinete";
    }
}
