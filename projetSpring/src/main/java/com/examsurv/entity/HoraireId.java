package com.examsurv.entity;

import lombok.*;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class HoraireId implements Serializable {
    private LocalTime hDebut;
    private LocalTime hFin;
}
