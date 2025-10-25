package com.examsurv.controller;

import com.examsurv.entity.Enseignant;
import com.examsurv.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enseignants")
@CrossOrigin(origins = "*")
public class EnseignantController {

    @Autowired
    private EnseignantRepository enseignantRepository;

    // 🔹 Route GET : /api/enseignants
    @GetMapping
    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
    }

    // 🔹 Route GET : /api/enseignants/string
    @GetMapping("/string")
    public String testString() {
        return "✅ Contrôleur Enseignant fonctionne parfaitement !";
    }
}
