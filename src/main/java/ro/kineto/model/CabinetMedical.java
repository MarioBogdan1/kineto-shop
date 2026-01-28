package ro.kineto.model;

/**
 * Model pentru un cabinet medical de kinetoterapie
 * Conține informații despre cabinete de recuperare din diferite orașe
 */
public class CabinetMedical {
    
    private Long id;
    private String oras;           // Craiova, București, Cluj, Timișoara
    private String nume;           // Numele cabinetului
    private String descriere;      // Descriere scurtă (2-4 propoziții)
    private String adresa;         // Adresa completă
    private String googleMapsUrl;  // Link direct la Google Maps
    private String imagineUrl;     // Cale către imagine locală
    
    // Constructor gol
    public CabinetMedical() {}
    
    // Constructor complet
    public CabinetMedical(Long id, String oras, String nume, String descriere, 
                          String adresa, String googleMapsUrl, String imagineUrl) {
        this.id = id;
        this.oras = oras;
        this.nume = nume;
        this.descriere = descriere;
        this.adresa = adresa;
        this.googleMapsUrl = googleMapsUrl;
        this.imagineUrl = imagineUrl;
    }
    
    // Getteri și Setteri
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getOras() {
        return oras;
    }
    
    public void setOras(String oras) {
        this.oras = oras;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public String getDescriere() {
        return descriere;
    }
    
    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
    
    public String getAdresa() {
        return adresa;
    }
    
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    public String getGoogleMapsUrl() {
        return googleMapsUrl;
    }
    
    public void setGoogleMapsUrl(String googleMapsUrl) {
        this.googleMapsUrl = googleMapsUrl;
    }
    
    public String getImagineUrl() {
        return imagineUrl;
    }
    
    public void setImagineUrl(String imagineUrl) {
        this.imagineUrl = imagineUrl;
    }
}
