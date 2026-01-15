# KinetoShop - Site Produse Kinetoterapie

Aplicație web Spring Boot pentru un magazin online cu produse de kinetoterapie.

## 🏥 Caracteristici

- Design medical profesional cu culori calme (verde, albastru, alb)
- Responsive (telefon, tabletă, desktop)
- Carduri produse cu imagine, descriere și buton de cumpărare
- Template engine Thymeleaf
- Produse hardcodate (fără bază de date)

## 📁 Structura Proiectului

```
kineto.ro/
├── pom.xml                              # Configurare Maven
├── src/main/java/ro/kineto/
│   ├── KinetoApplication.java           # Clasa principală
│   ├── model/
│   │   └── Produs.java                  # Model produs
│   ├── service/
│   │   └── ProdusService.java           # Serviciu cu produse hardcodate
│   └── controller/
│       └── HomeController.java          # Controller pagină principală
├── src/main/resources/
│   ├── application.properties           # Configurări aplicație
│   ├── templates/
│   │   └── index.html                   # Template Thymeleaf
│   └── static/css/
│       └── style.css                    # Stiluri CSS
└── README.md
```

## 🚀 Instrucțiuni de Rulare

### Cerințe
- Java 17 sau mai nou
- Maven 3.6+

### Pași

1. **Navighează în directorul proiectului:**
   ```bash
   cd kineto.ro
   ```

2. **Compilează și rulează aplicația:**
   ```bash
   ./mvnw spring-boot:run
   ```
   
   Sau pe Windows:
   ```bash
   mvnw.cmd spring-boot:run
   ```

3. **Accesează aplicația:**
   Deschide browser-ul la: [http://localhost:8080](http://localhost:8080)

### Alternativ - Cu Maven instalat global

```bash
mvn spring-boot:run
```

### Build JAR executabil

```bash
mvn clean package
java -jar target/kineto-shop-1.0.0.jar
```

## 🛠 Tehnologii Utilizate

- **Backend:** Java 17, Spring Boot 3.2
- **Frontend:** HTML5, CSS3, Thymeleaf
- **Build:** Maven

## 📝 Note

- Produsele sunt hardcodate în `ProdusService.java`
- Pentru a adăuga/modifica produse, editează metoda `getToateProdusele()`
- Imaginile sunt încărcate de pe Unsplash (necesită conexiune internet)
