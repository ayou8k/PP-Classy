package enset.pip.virtualclass.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @Size(min = 10, max = 15)
    private String tel;
    @Email
    private String email;
    @OneToOne
    @EqualsAndHashCode.Exclude Compte compte;

    @ManyToOne
    @JoinColumn
    @EqualsAndHashCode.Exclude private Departement departement;

    @ManyToMany
    private Set<Classe> classes;

    @OneToMany(mappedBy = "professeur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    Set<Element_module> element_module;

}
