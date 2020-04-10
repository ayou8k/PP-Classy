package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Publication_Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long Id;

    private String titre;
    private String contenu;
    private String files;

    @ManyToOne
    @JoinColumn
    private Categorie categorie;

    @ManyToOne
    @JoinColumn
    private Compte compte;

    @ManyToOne
    @JoinColumn
    private Status status;

    @OneToMany(mappedBy = "publicationForum")
    private Set<Commentaire> commentaires;

}
