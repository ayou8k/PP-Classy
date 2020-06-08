package enset.pip.virtualclass.entities;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Etudiant {
    //F137318699
    @Id
    @Column(length = 10)
    private String Id;
    private String prenom;
    private String nom;
    @Email
    private String email;
    @Size(min = 10, max = 13)
    private String tel;
    @OneToOne
    @EqualsAndHashCode.Exclude Diplome diplome;

    @OneToOne
    Compte compte;

    @ManyToOne
    @JoinColumn
    private Classe classe;

}
