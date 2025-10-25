package com.examsurv.repository;

import com.examsurv.entity.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {
    Optional<Enseignant> findByEmail(String email);
}
