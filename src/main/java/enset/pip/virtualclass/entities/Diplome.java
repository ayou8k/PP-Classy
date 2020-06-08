package enset.pip.virtualclass.entities;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @EqualsAndHashCode.Exclude Etudiant etudiant;

}
