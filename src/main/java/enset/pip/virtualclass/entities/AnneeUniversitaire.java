package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity @NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnneeUniversitaire {
    @Id @GeneratedValue
    private Long Id;
    private String annee;

    @OneToMany(mappedBy = "anneeUniversitaire")
    private Set<Classe> classes;

}
