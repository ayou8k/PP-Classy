package enset.pip.virtualclass.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Publication_Projet extends Publication_Cours {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date dateDebutProjet;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date dateFinProjet;
    int noteMaximaleProjet;
    int nbTaches;
    @OneToMany(mappedBy = "projet")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @EqualsAndHashCode.Exclude
    Set<Tache> taches;

}
