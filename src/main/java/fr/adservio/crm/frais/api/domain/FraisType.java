package fr.adservio.crm.frais.api.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class FraisType {

    @Id
    @Column(unique = true, nullable = false)
    private long id;

    @Column(unique = true, nullable = false)
    private String libelle;

    @Column
    private boolean enabled;

    @Column
    private boolean attachedFileRequired;
}
