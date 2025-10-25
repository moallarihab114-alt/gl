package com.examsurv.controller;

import com.examsurv.entity.Enseignant;
import com.examsurv.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // Permet l’accès depuis React ou d’autres clients
public class AuthController {

    @Autowired
    private EnseignantRepository enseignantRepository;

    // 🔹 Route POST : /api/auth/login
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        String password = request.get("password");

        try {
            // Chercher l'enseignant par email
            Enseignant enseignant = enseignantRepository.findByEmail(email).orElse(null);

            if (enseignant == null) {
                return "❌ Aucun enseignant trouvé avec cet email.";
            }

            // Vérifier le mot de passe
            if (!enseignant.getPassword().equals(password)) {
                return "❌ Mot de passe incorrect.";
            }

            // Succès de la connexion
            return "✅ Connexion réussie, bienvenue " + enseignant.getPrenom() + " " + enseignant.getNom() + " !";
        } catch (Exception e) {
            return "⚠️ Erreur serveur : " + e.getMessage();
        }
    }
}
