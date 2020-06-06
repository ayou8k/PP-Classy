package enset.pip.virtualclass.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String code;

    @ManyToOne
    @JoinColumn
    @EqualsAndHashCode.Exclude private Filiere filiere;

    @ManyToOne
    @JoinColumn
    @EqualsAndHashCode.Exclude private AnneeUniversitaire anneeUniversitaire;

    @ManyToOne
    @JoinColumn
    @EqualsAndHashCode.Exclude private Niveau niveau;

    @OneToMany(mappedBy = "classe")
    private Set<Etudiant> etudiants;

    @ManyToMany
    private Set<Professeur> professeurs;

    @ManyToMany
    @EqualsAndHashCode.Exclude private Set<Element_module> element_modules;

}
