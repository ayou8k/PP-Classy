package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )//test giignore
    private Long Id;

    private String nomee;

    @OneToMany(mappedBy = "status")
    private Set<Publication_Forum> publicationForums;

    @ManyToOne
    @JoinColumn
    private Commentaire commentaire;

}
