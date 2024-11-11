package org.example;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * The main class of the Spring Boot application.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
    /**
     * The main method of the Spring Boot application.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}