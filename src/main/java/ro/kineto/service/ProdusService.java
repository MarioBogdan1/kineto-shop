package ro.kineto.service;

import org.springframework.stereotype.Service;
import ro.kineto.model.Produs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Serviciu pentru gestionarea produselor
 * Produsele sunt hardcodate (fără bază de date)
 */
@Service
public class ProdusService {
    
    private final List<Produs> produse;
    
    public ProdusService() {
        this.produse = initializareProduse();
    }
    
    /**
     * Returnează lista completă de produse de kinetoterapie
     */
    public List<Produs> getToateProdusele() {
        return produse;
    }
    
    /**
     * Găsește un produs după ID
     */
    public Optional<Produs> getProdusById(Long id) {
        return produse.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
    
    /**
     * Inițializează lista de produse
     */
    private List<Produs> initializareProduse() {
        List<Produs> lista = new ArrayList<>();
        
        // Produs 1: Banda elastică
        lista.add(new Produs(
            1L,
            "Bandă Elastică Rezistență Medie",
            "Bandă elastică ideală pentru exerciții de recuperare și tonifiere musculară. Rezistență medie, potrivită pentru începători.",
            "Banda elastică este un instrument esențial în kinetoterapie, folosită pentru exerciții de recuperare, tonifiere și întărire musculară. Această bandă cu rezistență medie este perfectă pentru începători și pentru cei care doresc să-și îmbunătățească flexibilitatea. Fabricată din latex natural de înaltă calitate, oferă o rezistență uniformă pe toată lungimea. Poate fi utilizată pentru exerciții ale membrelor superioare și inferioare, fiind ideală pentru recuperarea după accidentări.",
            "https://images.unsplash.com/photo-1517836357463-d25dfeac3438?w=400",
            "https://www.emag.ro",
            45.99
        ));
        
        // Produs 2: Minge pilates
        lista.add(new Produs(
            2L,
            "Minge Pilates 65cm",
            "Minge de exerciții pentru pilates și kinetoterapie. Perfectă pentru îmbunătățirea echilibrului și posturii.",
            "Mingea de pilates de 65cm este un echipament versatil, indispensabil pentru exercițiile de stabilitate și core. Fabricată din PVC anti-explozie, suportă până la 300kg. Ideală pentru exerciții de echilibru, stretching, yoga și recuperare post-traumatică. Include pompă de umflare. Suprafața antiderapantă asigură siguranța în timpul exercițiilor. Recomandată de kinetoterapeuți pentru îmbunătățirea posturii și întărirea musculaturii profunde.",
            "https://images.unsplash.com/photo-1574680096145-d05b474e2155?w=400",
            "https://www.decathlon.ro",
            89.99
        ));
        
        // Produs 3: Foam Roller
        lista.add(new Produs(
            3L,
            "Foam Roller Masaj",
            "Roller din spumă pentru auto-masaj și eliberare miofascială. Reduce tensiunea musculară și accelerează recuperarea.",
            "Foam roller-ul este instrumentul perfect pentru auto-masaj și eliberare miofascială. Cu o lungime de 45cm și un diametru de 15cm, acest roller din spumă EVA de înaltă densitate ajută la reducerea tensiunii musculare, îmbunătățirea circulației și accelerarea recuperării după antrenament. Textura cu relief stimulează punctele trigger și eliberează nodulii musculari. Recomandat atât pentru sportivi cât și pentru persoanele cu dureri cronice de spate.",
            "https://images.unsplash.com/photo-1600881333168-2ef49b341f30?w=400",
            "https://www.emag.ro",
            65.00
        ));
        
        // Produs 4: Set greutăți
        lista.add(new Produs(
            4L,
            "Set Gantere 2x2kg",
            "Set de gantere ușoare pentru exerciții de recuperare și tonifiere. Acoperite cu neopren pentru grip confortabil.",
            "Setul de gantere 2x2kg este perfect pentru exerciții de tonifiere și recuperare. Acoperite cu neopren de calitate superioară, oferă un grip confortabil și sigur. Forma hexagonală previne rostogolirea. Ideale pentru exerciții de brațe, umeri și spate. Greutatea moderată le face potrivite pentru începători, seniori și persoane în recuperare. Compacte și ușor de depozitat, pot fi folosite acasă sau la cabinet.",
            "https://images.unsplash.com/photo-1583454110551-21f2fa2afe61?w=400",
            "https://www.decathlon.ro",
            79.99
        ));
        
        // Produs 5: Covoraș yoga
        lista.add(new Produs(
            5L,
            "Covoraș Yoga Antiderapant",
            "Covoraș premium pentru yoga și exerciții de stretching. Suprafață antiderapantă, grosime 6mm pentru confort.",
            "Covorașul de yoga premium este fabricat din TPE ecologic, fără latex și fără PVC. Cu o grosime de 6mm, oferă amortizare optimă pentru genunchi și coloană. Suprafața dublă antiderapantă asigură stabilitate pe orice tip de podea. Dimensiuni generoase de 183x61cm. Ușor de curățat și de transportat, vine cu o curea de transport inclusă. Perfect pentru yoga, pilates, stretching și exerciții de kinetoterapie.",
            "https://images.unsplash.com/photo-1592432678016-e910b452f9a2?w=400",
            "https://www.emag.ro",
            120.00
        ));
        
        // Produs 6: Aparat TENS
        lista.add(new Produs(
            6L,
            "Aparat TENS Electrostimulare",
            "Dispozitiv de electrostimulare pentru ameliorarea durerii și recuperare musculară. Include 4 electrozi.",
            "Aparatul TENS (Transcutaneous Electrical Nerve Stimulation) este un dispozitiv medical pentru ameliorarea durerii fără medicamente. Cu 8 moduri de stimulare și 20 de nivele de intensitate, poate fi personalizat pentru diferite tipuri de durere. Include 4 electrozi autoadezivi reutilizabili. Eficient pentru dureri de spate, gât, umeri, articulații și dureri musculare. Compact și portabil, funcționează cu baterii AAA. Aprobat medical și recomandat de specialiști.",
            "https://images.unsplash.com/photo-1559757175-7cb057fba93c?w=400",
            "https://www.emag.ro",
            189.99
        ));
        
        // Produs 7: Minge de masaj
        lista.add(new Produs(
            7L,
            "Set Mingi Masaj Spiky",
            "Set de 3 mingi cu țepi pentru masaj și reflexoterapie. Diferite dimensiuni pentru diverse zone ale corpului.",
            "Setul include 3 mingi de masaj cu țepi de diferite dimensiuni (6cm, 8cm, 10cm) pentru a acoperi toate zonele corpului. Țepii stimulează circulația sanguină și ajută la eliberarea tensiunii musculare. Perfecte pentru masajul picioarelor, palmelor, spatelui și gâtului. Fabricate din silicon medical, sunt durabile și ușor de curățat. Ideale pentru reflexoterapie și auto-masaj zilnic.",
            "https://images.unsplash.com/photo-1599058917765-a780eda07a3e?w=400",
            "https://www.emag.ro",
            35.00
        ));
        
        // Produs 8: Corector postural
        lista.add(new Produs(
            8L,
            "Corector Postural Ajustabil",
            "Corector de postură reglabil pentru spate și umeri. Previne durerile de spate și îmbunătățește postura.",
            "Corectorul postural ajustabil este conceput pentru a corecta postura și a preveni durerile de spate cauzate de poziția incorectă. Cu bretele reglabile și material respirabil, oferă confort pe toată durata purtării. Discret sub haine, poate fi purtat la birou, acasă sau în timpul activităților zilnice. Ajută la alinierea coloanei vertebrale și la reducerea tensiunii din zona umerilor. Recomandat pentru persoanele care stau mult la birou.",
            "https://images.unsplash.com/photo-1616279969862-60c1c8c89b94?w=400",
            "https://www.decathlon.ro",
            89.00
        ));
        
        // Produs 9: Banda de rezistență set
        lista.add(new Produs(
            9L,
            "Set 5 Benzi Rezistență",
            "Set complet de 5 benzi elastice cu rezistențe diferite. Include ancoră de ușă și mânere.",
            "Setul profesional include 5 benzi elastice cu rezistențe progresive (2kg, 4kg, 7kg, 9kg, 14kg), codificate prin culori. Include mânere ergonomice, ancoră de ușă, curele pentru glezne și geantă de transport. Perfect pentru antrenament complet acasă sau în deplasare. Benzile pot fi combinate pentru a crește rezistența. Ideale pentru recuperare, tonifiere și antrenament de forță. Latex natural de înaltă calitate.",
            "https://images.unsplash.com/photo-1598632640487-6ea4a4e8b963?w=400",
            "https://www.emag.ro",
            149.99
        ));
        
        // Produs 10: Pernă cervicală
        lista.add(new Produs(
            10L,
            "Pernă Cervicală Ortopedică",
            "Pernă ergonomică cu memorie pentru suport cervical optim. Reduce durerile de gât și îmbunătățește somnul.",
            "Perna cervicală ortopedică este fabricată din spumă cu memorie de înaltă densitate care se adaptează perfect conturului gâtului și capului. Designul ergonomic cu două înălțimi (10cm și 12cm) permite alegerea poziției optime. Husă din bambus hipoalergenică și lavabilă. Reduce durerile de gât, ameliorează migrenele și îmbunătățește calitatea somnului. Recomandată de ortopezi și kinetoterapeuți.",
            "https://images.unsplash.com/photo-1631157769667-797d6a222d0f?w=400",
            "https://www.emag.ro",
            159.00
        ));
        
        // Produs 11: Balance Board
        lista.add(new Produs(
            11L,
            "Balance Board Echilibru",
            "Placă de echilibru din lemn pentru antrenarea stabilității și coordonării. Suprafață antiderapantă.",
            "Balance board-ul este un instrument excelent pentru antrenarea echilibrului, coordonării și stabilității. Fabricat din lemn de fag laminat, cu suprafață antiderapantă, suportă până la 150kg. Diametrul de 40cm și înălțimea de 8cm oferă provocarea perfectă pentru toate nivelurile. Întărește musculatura picioarelor, gleznelor și core-ului. Folosit în recuperarea după entorse și pentru prevenirea accidentărilor la sportivi.",
            "https://images.unsplash.com/photo-1544367567-0f2fcb009e0b?w=400",
            "https://www.decathlon.ro",
            99.00
        ));
        
        // Produs 12: Aparat masaj percuție
        lista.add(new Produs(
            12L,
            "Pistol Masaj Percuție",
            "Aparat profesional de masaj cu percuție pentru relaxare musculară profundă. 6 capete interschimbabile.",
            "Pistolul de masaj cu percuție oferă relaxare musculară profundă prin vibrații de înaltă frecvență (până la 3200 percuții/minut). Include 6 capete interschimbabile pentru diferite grupe musculare și 6 nivele de intensitate. Motor silențios sub 45dB. Baterie Li-ion cu autonomie de 6 ore. Ideal pentru recuperare post-antrenament, ameliorarea durerii musculare și îmbunătățirea circulației. Design ergonomic pentru auto-masaj facil.",
            "https://images.unsplash.com/photo-1617952739858-28043cecdae3?w=400",
            "https://www.emag.ro",
            299.00
        ));
        
        return lista;
    }
}
