package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data @Entity @NoArgsConstructor
@AllArgsConstructor
@ToString
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long Id;
    private String label;
    private String code;

    @OneToMany(mappedBy = "departement")
    private Set<Filiere> filieres;

    @OneToMany(mappedBy = "departement")
    private Set<Professeur> professeurs;
}
