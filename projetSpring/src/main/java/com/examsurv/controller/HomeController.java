package com.examsurv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
        🌸 Bienvenue sur l'application de gestion des surveillances d'examens 🌸
        <br><br>
        Utilise les routes suivantes :
        <ul>
            <li><b>/api/enseignants/string</b> → Test du contrôleur enseignant</li>
            <li><b>/api/enseignants</b> → Liste des enseignants (via GET)</li>
        </ul>
        """;
    }
}
