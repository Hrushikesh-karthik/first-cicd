package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
            🚀 Java Application Running!

            Successfully deployed using:
            Java + Spring Boot
            Docker
            Kubernetes

            Hello from Localhostyy! ☸️
            """;
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
