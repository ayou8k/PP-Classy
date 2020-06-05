package enset.pip.virtualclass.entities;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    Diplome diplome;

    @OneToOne
    Compte compte;

    @ManyToOne
    @JoinColumn
    private Classe classe;

}
