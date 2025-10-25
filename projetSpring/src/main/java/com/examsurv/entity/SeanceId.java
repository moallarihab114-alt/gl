package com.examsurv.entity;

import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeanceId implements Serializable {
    private LocalDate dateEpreuve;
    private LocalTime hDebut;
    private LocalTime hFin;
}
