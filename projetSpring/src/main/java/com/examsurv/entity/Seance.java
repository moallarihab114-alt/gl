package com.examsurv.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "seance")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(SeanceId.class)
public class Seance implements Serializable {

    @Id
    private LocalDate dateEpreuve;

    @Id
    private LocalTime hDebut;

    @Id
    private LocalTime hFin;

    // 🔹 Une séance contient plusieurs matières
    @OneToMany(mappedBy = "seance", cascade = CascadeType.ALL)
    private List<Matiere> matieres;

    // 🔹 Une séance peut avoir plusieurs enseignants
    @ManyToMany(mappedBy = "seancesDemandees")
    private List<Enseignant> enseignants;
}
