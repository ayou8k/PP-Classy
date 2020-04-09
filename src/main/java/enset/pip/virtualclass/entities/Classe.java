package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data @NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long Id;
    private String code;

    @ManyToOne
    @JoinColumn
    private Filiere filiere;

    @ManyToOne
    @JoinColumn
    private AnneeUniversitaire anneeUniversitaire;

    @ManyToOne
    @JoinColumn
    private Niveau niveau;

    @OneToMany(mappedBy = "classe")
    private Set<Etudiant> etudiants;

    @ManyToMany
    private Set<Professeur> professeurs;

    @ManyToMany
    private Set<Element_module> element_modules;

}
