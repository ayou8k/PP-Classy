package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    Long id;
    private String login;
    @Size(min=6,max=10)
    private String password;


    //hadchi yajouz wla la?
    @OneToOne(mappedBy="compte")
    private Etudiant etudiant;
    @OneToOne(mappedBy="compte")
    private AgentScolarite agentScolarite;
    @OneToOne(mappedBy="compte")
    private Professeur professeur;
    //?

    @OneToMany(mappedBy = "compte")
    private Set<Message> messages;

    @ManyToMany
    private Set<Groupe> groupes;

    @OneToMany(mappedBy = "compte")
    private Set<Commentaire> commentaires;

    @ManyToOne
    @JoinColumn
    private Publication_Forum publicationForum;
}
