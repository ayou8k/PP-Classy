package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;
@Data
@Entity @NoArgsConstructor
@AllArgsConstructor
@ToString
public class Filiere {
    @Id
    @GeneratedValue
    private Long Id;
    private String description;

    @OneToMany(mappedBy = "filiere")
    private Set<Classe> classes;

    @ManyToOne
    @JoinColumn
    private Departement departement;

}
