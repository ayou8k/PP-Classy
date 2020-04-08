package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long id;
    private String nom;
    private String prenom;
    @Size(min=10,max=15)
    private String tel;
    @Email
    private String email;
    @OneToOne
    Compte compte;

    @ManyToOne
    @JoinColumn
    private Departement departement;

    @ManyToMany
    private Set<Classe> classes;

}
