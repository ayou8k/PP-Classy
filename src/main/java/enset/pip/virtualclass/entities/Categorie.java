package enset.pip.virtualclass.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nom;

    @OneToMany(mappedBy = "categorie")
    @EqualsAndHashCode.Exclude
    private Set<Publication_Forum> publicationForums;

}
