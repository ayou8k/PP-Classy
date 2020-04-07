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
public class Comment {
    @Id
    @GeneratedValue
    private Long Id;
    private String texte;
    @DateTimeFormat
    private Date date_commentaire;

    @ManyToOne
    @JoinColumn
    private Publication publication;

//    @OneToMany(mappedBy = "comment")
//    private Set<Compte> comptes;

    @OneToMany(mappedBy = "comment")
    private Set<State> states;

}