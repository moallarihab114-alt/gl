package com.examsurv.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "enseignant")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, length = 100)
    private String prenom;

    @Column(length = 20)
    private String tel;

    // Relation avec grade
    @ManyToOne
    @JoinColumn(name = "grade", referencedColumnName = "grade")
    private Grade grade;
    
    @Column(unique = true, length = 100)
    private String email;
    
    @Column(length = 255)
    private String password;

    //  Relation ManyToMany avec Matiere
    @ManyToMany
    @JoinTable(
        name = "enseignant_matiere",
        joinColumns = @JoinColumn(name = "enseignant_id"),
        inverseJoinColumns = {
        		@JoinColumn(name = "nom_matiere", referencedColumnName = "nom"),
        		@JoinColumn(name = "date_epreuve", referencedColumnName = "dateEpreuve")

        }
    )
    private List<Matiere> matieresEnseignees;

    //  Relation ManyToMany avec Seance
    @ManyToMany
    @JoinTable(
        name = "enseignant_seance",
        joinColumns = @JoinColumn(name = "enseignant_id"),
        inverseJoinColumns = {
            @JoinColumn(name = "date_epreuve", referencedColumnName = "dateEpreuve"),
            @JoinColumn(name = "hDebut", referencedColumnName = "hDebut"),
            @JoinColumn(name = "hFin", referencedColumnName = "hFin")
        }
    )
    private List<Seance> seancesDemandees;
}
