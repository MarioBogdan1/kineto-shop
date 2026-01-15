package ro.kineto.service;

import org.springframework.stereotype.Service;
import ro.kineto.model.Produs;

import java.util.ArrayList;
import java.util.List;

/**
 * Serviciu pentru gestionarea produselor
 * Produsele sunt hardcodate (fără bază de date)
 */
@Service
public class ProdusService {
    
    /**
     * Returnează lista completă de produse de kinetoterapie
     */
    public List<Produs> getToateProdusele() {
        List<Produs> produse = new ArrayList<>();
        
        // Produs 1: Banda elastică
        produse.add(new Produs(
            1L,
            "Bandă Elastică Rezistență Medie",
            "Bandă elastică ideală pentru exerciții de recuperare și tonifiere musculară. Rezistență medie, potrivită pentru începători.",
            "https://images.unsplash.com/photo-1598289431512-b97b0917affc?w=400",
            "https://www.emag.ro",
            45.99
        ));
        
        // Produs 2: Minge pilates
        produse.add(new Produs(
            2L,
            "Minge Pilates 65cm",
            "Minge de exerciții pentru pilates și kinetoterapie. Perfectă pentru îmbunătățirea echilibrului și posturii.",
            "https://images.unsplash.com/photo-1544367567-0f2fcb009e0b?w=400",
            "https://www.decathlon.ro",
            89.99
        ));
        
        // Produs 3: Foam Roller
        produse.add(new Produs(
            3L,
            "Foam Roller Masaj",
            "Roller din spumă pentru auto-masaj și eliberare miofascială. Reduce tensiunea musculară și accelerează recuperarea.",
            "https://images.unsplash.com/photo-1571019614242-c5c5dee9f50b?w=400",
            "https://www.emag.ro",
            65.00
        ));
        
        // Produs 4: Set greutăți
        produse.add(new Produs(
            4L,
            "Set Gantere 2x2kg",
            "Set de gantere ușoare pentru exerciții de recuperare și tonifiere. Acoperite cu neopren pentru grip confortabil.",
            "https://images.unsplash.com/photo-1586401100295-7a8096fd231a?w=400",
            "https://www.decathlon.ro",
            79.99
        ));
        
        // Produs 5: Covoraș yoga
        produse.add(new Produs(
            5L,
            "Covoraș Yoga Antiderapant",
            "Covoraș premium pentru yoga și exerciții de stretching. Suprafață antiderapantă, grosime 6mm pentru confort.",
            "https://images.unsplash.com/photo-1601925260368-ae2f83cf8b7f?w=400",
            "https://www.emag.ro",
            120.00
        ));
        
        // Produs 6: Aparat TENS
        produse.add(new Produs(
            6L,
            "Aparat TENS Electrostimulare",
            "Dispozitiv de electrostimulare pentru ameliorarea durerii și recuperare musculară. Include 4 electrozi.",
            "https://images.unsplash.com/photo-1576091160550-2173dba999ef?w=400",
            "https://www.emag.ro",
            189.99
        ));
        
        return produse;
    }
}
