package enset.pip.virtualclass.entities;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Diplome {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @NotNull
    String nom;//Diplomat Name : DUT , Licence etc ...
    @NotNull
    String filiere;//Genie Info , Licence ISI
    @NotNull
    String mention;//Bien , Tres Bien , Assez Bien , Passable
    @DateTimeFormat(iso = ISO.DATE)
    Date dateObtention;

    @OneToOne(mappedBy = "diplome")
    Etudiant etudiant;

}
