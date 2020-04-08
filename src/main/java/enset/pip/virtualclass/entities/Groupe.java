package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    Long id_groupe;
    String nom;
    String DateCreation;

    @OneToMany(mappedBy = "groupe")
    private Set<Message> messages;

    @ManyToMany
    private Set<Compte> comptes;
    @ManyToMany
    Set<Tache> taches;

}
