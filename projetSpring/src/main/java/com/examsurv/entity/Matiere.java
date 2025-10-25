package com.examsurv.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "matiere")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(MatiereId.class)
public class Matiere implements Serializable {

    @Id
    @Column(length = 100, nullable = false)
    private String nom;

    @Id
    @Column(nullable = false)
    private LocalDate dateEpreuve;

    @Column(nullable = false)
    private int nbPaquet;

    @Column(nullable = false)
    private LocalTime hDebut;

    @Column(nullable = false)
    private LocalTime hFin;

    // 🔹 Chaque matière appartient à une séance
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "dateEpreuve", referencedColumnName = "dateEpreuve", insertable = false, updatable = false),
        @JoinColumn(name = "hDebut", referencedColumnName = "hDebut", insertable = false, updatable = false),
        @JoinColumn(name = "hFin", referencedColumnName = "hFin", insertable = false, updatable = false)
    })
    private Seance seance;

    // 🔹 Plusieurs enseignants peuvent enseigner la même matière
    @ManyToMany(mappedBy = "matieresEnseignees")
    private List<Enseignant> enseignants;
}
