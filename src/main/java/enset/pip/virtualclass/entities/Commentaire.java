package enset.pip.virtualclass.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String texte;
    @DateTimeFormat
    private Date date_commentaire;

    @ManyToOne
    @JoinColumn
    @EqualsAndHashCode.Exclude
    private Publication_Forum publicationForum;

    @ManyToOne
    @JoinColumn
    private Compte compte;

    @OneToMany(mappedBy = "commentaire")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @EqualsAndHashCode.Exclude    private Set<Status> statuses;

}
