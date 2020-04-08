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
public class Statut {
    @Id
    @GeneratedValue
    private Long Id;

    private String nom;

    @OneToMany(mappedBy = "statut")
    private Set<Publication_Forum> publicationForums;

    @ManyToOne
    @JoinColumn
    private Commentaire commentaire;

}
