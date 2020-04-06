package fr.adservio.crm.frais.api.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Frais {
    @Id
    @Column(unique = true, nullable = false)
    private long id;

    @Column
    private String demandeObject;

    @Column
    private String comments;

    /**
     * The applicant identifier
     */
    @Column
    private Long applicantId;

    /**
     * The approver identifier
     */
    @Column
    private Long approverId;

    @Column
    private Date approvedAt;

    @Column
    private Date createdAt;

    @Column
    private boolean isValidated;

    @Column
    private boolean isPayed;

    @OneToMany(mappedBy = "frais")
    @JsonManagedReference
    private List<FraisLine> fraisLines;

    @OneToMany(mappedBy = "frais")
    private List<UploadedFile> uploadedFilesList;

}
