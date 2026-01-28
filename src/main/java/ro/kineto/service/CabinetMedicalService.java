package ro.kineto.service;

import org.springframework.stereotype.Service;
import ro.kineto.model.CabinetMedical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service pentru cabinete medicale
 * Conține date hardcodate cu cabinete din diverse orașe
 */
@Service
public class CabinetMedicalService {
    
    private final List<CabinetMedical> cabinete;
    
    public CabinetMedicalService() {
        this.cabinete = new ArrayList<>();
        initializeCabinete();
    }
    
    /**
     * Inițializează lista de cabinete cu date hardcodate
     */
    private void initializeCabinete() {
        // Craiova - Prokinetic
        cabinete.add(new CabinetMedical(
            1L,
            "Craiova",
            "Prokinetic",
            "Prokinetic oferă servicii complete de kinetoterapie și recuperare medicală. Cu o echipă de specialiști experimentați și echipamente moderne, asigurăm recuperarea rapidă și sigură a pacienților. Centrul nostru se dedică reabilitării post-operatorii și prevenției leziunilor.",
            "Strada Brazda lui Novac 75E, Craiova, România",
            "https://www.google.com/maps/search/?api=1&query=Strada%20Brazda%20lui%20Novac%2075E%2C%20Craiova%2C%20Romania",
            "/images/prokinetic.jpg"
        ));
        
        // București - Kinetic Sport & Medicine
        cabinete.add(new CabinetMedical(
            2L,
            "București",
            "Kinetic Sport & Medicine",
            "Kinetic Sport & Medicine este un centru de excelență în medicina sportivă și kinetoterapie. Oferim programe personalizate de recuperare pentru sportivi profesioniști și amatori. Echipa noastră include doctori în medicina sportivă, kinetoterapeuti licențiați și specialiști în fitness medical.",
            "Bulevardul Gheorghe Duca 24, București, România",
            "https://www.google.com/maps/search/?api=1&query=Bulevardul%20Gheorghe%20Duca%2024%2C%20Bucuresti%2C%20Romania",
            "/images/kinetic-sport-medicine.jpg"
        ));
        
        // Cluj - Novoengrama
        cabinete.add(new CabinetMedical(
            3L,
            "Cluj",
            "Novoengrama – Centru medical de recuperare",
            "Novoengrama este specialist în recuperare neuromotorie și kinetoterapie avansată. Utilizând tehnologie de vârf și metode terapeutice inovatoare, ajutăm pacienții cu afecțiuni neurologice și musculoscheletale. Programele noastre sunt adaptate fiecărui pacient în parte.",
            "Strada Fagului 1A (intrarea de pe Strada Romul Ladea), Cluj-Napoca, România",
            "https://www.google.com/maps/search/?api=1&query=Strada%20Fagului%201A%2C%20Cluj-Napoca%2C%20Romania",
            "/images/novoengrama.jpg"
        ));
        
        // Timișoara - Kynesys
        cabinete.add(new CabinetMedical(
            4L,
            "Timișoara",
            "Kynesys",
            "Kynesys oferă servicii integrate de kinetoterapie și recuperare funcțională. Cu specialiști calificați și echipamente de ultima generație, asigurăm rezultate optim pentru fiecare pacient. Suntem dedicați recuperării rapide și reintegrării pacienților în activitățile zilnice.",
            "Piața Alexandru Mocioni 6, Timișoara, România",
            "https://www.google.com/maps/search/?api=1&query=Piata%20Alexandru%20Mocioni%206%2C%20Timisoara%2C%20Romania",
            "/images/kynesys.jpg"
        ));
    }
    
    /**
     * Returnează toate cabinetele
     */
    public List<CabinetMedical> getToateCabinetele() {
        return new ArrayList<>(cabinete);
    }
    
    /**
     * Returnează cabinetele dintr-un anumit oraș
     */
    public List<CabinetMedical> getCabineteByOras(String oras) {
        return cabinete.stream()
            .filter(cabinet -> cabinet.getOras().equalsIgnoreCase(oras))
            .collect(Collectors.toList());
    }
    
    /**
     * Returnează cabinetul după ID
     */
    public CabinetMedical getCabinetById(Long id) {
        return cabinete.stream()
            .filter(cabinet -> cabinet.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
    
    /**
     * Returnează lista de orașe unice
     */
    public List<String> getOrase() {
        return cabinete.stream()
            .map(CabinetMedical::getOras)
            .distinct()
            .sorted()
            .collect(Collectors.toList());
    }
}
