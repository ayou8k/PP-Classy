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

@Data @NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Niveau {
    @Id    @GeneratedValue
    private Long Id;
    private String niveau;

    @OneToMany(mappedBy = "niveau")
    private Set<Classe> classes;
}
