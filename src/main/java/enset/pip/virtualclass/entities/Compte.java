package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;

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

    @OneToOne(mappedBy="compte")
    Etudiant etudiant;
    @OneToOne(mappedBy="compte")
    AgentScolarite agentScolarite;
    @OneToOne(mappedBy="compte")
    Professeur professeur ;
}
