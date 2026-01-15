package ro.kineto.model;

/**
 * Model pentru un produs de kinetoterapie
 * Conține toate informațiile necesare pentru afișare
 */
public class Produs {
    
    private Long id;
    private String nume;
    private String descriere;
    private String imagine;      // URL sau cale către imagine
    private String linkCumparare; // Link extern pentru achiziție
    private Double pret;
    
    // Constructor gol
    public Produs() {}
    
    // Constructor cu toți parametrii
    public Produs(Long id, String nume, String descriere, String imagine, String linkCumparare, Double pret) {
        this.id = id;
        this.nume = nume;
        this.descriere = descriere;
        this.imagine = imagine;
        this.linkCumparare = linkCumparare;
        this.pret = pret;
    }
    
    // Getteri și Setteri
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    
    public String getDescriere() { return descriere; }
    public void setDescriere(String descriere) { this.descriere = descriere; }
    
    public String getImagine() { return imagine; }
    public void setImagine(String imagine) { this.imagine = imagine; }
    
    public String getLinkCumparare() { return linkCumparare; }
    public void setLinkCumparare(String linkCumparare) { this.linkCumparare = linkCumparare; }
    
    public Double getPret() { return pret; }
    public void setPret(Double pret) { this.pret = pret; }
}
