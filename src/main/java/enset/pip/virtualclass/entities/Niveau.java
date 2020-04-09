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
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long Id;
    private String niveau;

    @OneToMany(mappedBy = "niveau")
    private Set<Classe> classes;
}
