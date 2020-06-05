package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
    private Publication_Forum publicationForum;

    @ManyToOne
    @JoinColumn
    private Compte compte;

    @OneToMany(mappedBy = "commentaire")
    private Set<Status> statuses;

}