package ro.kineto.model;

import java.util.List;

/**
 * Model pentru un serviciu de kinetoterapie
 */
public class Serviciu {
    
    private Long id;
    private String nume;
    private String descriere;
    private List<String> beneficii;
    private String cuiSeAdreseaza;
    private String icon; // Emoji sau icon pentru serviciu
    
    // Constructor gol
    public Serviciu() {}
    
    // Constructor complet
    public Serviciu(Long id, String nume, String descriere, List<String> beneficii, 
                   String cuiSeAdreseaza, String icon) {
        this.id = id;
        this.nume = nume;
        this.descriere = descriere;
        this.beneficii = beneficii;
        this.cuiSeAdreseaza = cuiSeAdreseaza;
        this.icon = icon;
    }
    
    // Getteri și Setteri
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    
    public String getDescriere() { return descriere; }
    public void setDescriere(String descriere) { this.descriere = descriere; }
    
    public List<String> getBeneficii() { return beneficii; }
    public void setBeneficii(List<String> beneficii) { this.beneficii = beneficii; }
    
    public String getCuiSeAdreseaza() { return cuiSeAdreseaza; }
    public void setCuiSeAdreseaza(String cuiSeAdreseaza) { this.cuiSeAdreseaza = cuiSeAdreseaza; }
    
    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }
}
