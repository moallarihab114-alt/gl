package com.examsurv.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "horaire")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Horaire {

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "hDebut", column = @Column(name = "hDebut")),
        @AttributeOverride(name = "hFin", column = @Column(name = "hFin"))
    })
    private HoraireId id;
}
