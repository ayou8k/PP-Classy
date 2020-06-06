package enset.pip.virtualclass.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

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
    @EqualsAndHashCode.Exclude Module module;

    @ManyToMany
    @EqualsAndHashCode.Exclude Set<Classe> classes;

    @ManyToOne
    @EqualsAndHashCode.Exclude Professeur professeur;

    @OneToMany(mappedBy = "element_module")
    Set<Publication_Cours> Publication_Cours;
}
