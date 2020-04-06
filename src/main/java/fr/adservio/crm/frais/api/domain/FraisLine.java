package fr.adservio.crm.frais.api.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class FraisLine {

    @Id
    @Column(unique = true, nullable = false)
    private Long id;

    @OneToOne
    private FraisType fraisType;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private Devise devise;

    private BigDecimal montant;

    private int tva;

    private long missionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Frais frais;
}
