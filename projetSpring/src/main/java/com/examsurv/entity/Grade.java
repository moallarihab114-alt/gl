package com.examsurv.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "grade")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Grade {

    @Id
    @Column(length = 50)
    private String grade;

    @Column(nullable = false)
    private int chargeSurveillance;

    @OneToMany(mappedBy = "grade", cascade = CascadeType.ALL)
    private List<Enseignant> enseignants;
}
