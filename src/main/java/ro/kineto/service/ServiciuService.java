package ro.kineto.service;

import org.springframework.stereotype.Service;
import ro.kineto.model.Serviciu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Serviciu pentru gestionarea serviciilor de kinetoterapie
 */
@Service
public class ServiciuService {
    
    /**
     * Returnează lista completă de servicii
     */
    public List<Serviciu> getToateServiciile() {
        List<Serviciu> servicii = new ArrayList<>();
        
        // Serviciu 1: Kinetoterapie de recuperare
        servicii.add(new Serviciu(
            1L,
            "Kinetoterapie de Recuperare",
            "Programe personalizate de recuperare pentru persoanele care au suferit accidentări, intervenții chirurgicale sau au probleme de mobilitate. Terapie adaptată nevoilor individuale, cu focus pe restabilirea funcționalității și reducerea durerii.",
            Arrays.asList(
                "Recuperare completă a mobilității",
                "Reducere durere și inflamație",
                "Întărire musculară progresivă",
                "Îmbunătățire echilibru și coordonare",
                "Prevenire recidive"
            ),
            "Persoanele care au suferit accidentări, intervenții chirurgicale, accidente vasculare cerebrale, sau au probleme de mobilitate cauzate de boli cronice.",
            "🏥"
        ));
        
        // Serviciu 2: Kinetoterapie sportivă
        servicii.add(new Serviciu(
            2L,
            "Kinetoterapie Sportivă",
            "Programe specializate pentru sportivi, axate pe prevenirea accidentărilor, recuperarea după leziuni sportive și optimizarea performanței. Tehnici avansate de recuperare și pregătire fizică.",
            Arrays.asList(
                "Recuperare rapidă după leziuni sportive",
                "Prevenire accidentări",
                "Îmbunătățire performanță",
                "Optimizare flexibilitate și forță",
                "Programe de pregătire personalizate"
            ),
            "Sportivi profesioniști, amatori, echipe sportive și persoane active care doresc să-și optimizeze performanța sau să prevină accidentările.",
            "⚽"
        ));
        
        // Serviciu 3: Recuperare post-operatorie
        servicii.add(new Serviciu(
            3L,
            "Recuperare Post-Operatorie",
            "Programe specializate de recuperare după intervenții chirurgicale, cu focus pe cicatrizare corectă, restabilirea funcționalității și prevenirea complicațiilor. Urmărire medicală și progres monitorizat.",
            Arrays.asList(
                "Accelerează procesul de cicatrizare",
                "Previne complicații post-operatorii",
                "Restabilire rapidă a funcționalității",
                "Reducere durere post-operatorie",
                "Urmărire medicală specializată"
            ),
            "Pacienții care au suferit intervenții chirurgicale ortopedice, neurochirurgicale, cardiace sau alte proceduri care necesită recuperare fizică.",
            "🩺"
        ));
        
        // Serviciu 4: Corectare postură
        servicii.add(new Serviciu(
            4L,
            "Corectare Postură",
            "Programe de corectare a posturii pentru persoanele care lucrează la birou, au dureri de spate sau probleme de aliniere. Exerciții corective și educație posturală pentru o viață fără dureri.",
            Arrays.asList(
                "Corectare aliniere coloană vertebrală",
                "Reducere dureri de spate și gât",
                "Îmbunătățire poziție la birou",
                "Prevenire probleme cronice",
                "Educație posturală personalizată"
            ),
            "Persoanele care lucrează la birou, au dureri cronice de spate, gât sau umeri, copii și adolescenți cu probleme de postură, sau oricine dorește să-și îmbunătățească poziția corporală.",
            "📐"
        ));
        
        return servicii;
    }
}
