package ro.kineto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clasa principală pentru aplicația Spring Boot
 * Pornește serverul web și configurează aplicația
 */
@SpringBootApplication
public class KinetoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(KinetoApplication.class, args);
    }
}
