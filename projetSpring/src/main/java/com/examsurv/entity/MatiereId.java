package com.examsurv.entity;

import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatiereId implements Serializable {
    private String nom;
    private LocalDate dateEpreuve;
}
