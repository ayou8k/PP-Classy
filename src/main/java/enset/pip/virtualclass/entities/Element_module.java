package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Element_module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long id;
    private String designation;
    private String coeficient;

    @ManyToOne
    Module module;

    @ManyToMany
    Set<Classe> classes;

    @ManyToOne
    Professeur professeur;

    @OneToMany(mappedBy = "element_module")
    Set<Publication_Cours> Publication_Cours;
}
