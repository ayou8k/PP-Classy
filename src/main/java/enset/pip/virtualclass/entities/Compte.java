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
    Etudiant etudiant;
    @OneToOne(mappedBy="compte")
    AgentScolarite agentScolarite;
    @OneToOne(mappedBy="compte")
    Professeur professeur ;
    //?

    @OneToMany(mappedBy = "compte")
    private Set<Message> messageSets;

    @ManyToMany
    List<Group> groupList;

    @OneToMany(mappedBy = "compte")
    private Set<Comment> comments;

    @ManyToOne
    @JoinColumn
    private Publication publication;
}
