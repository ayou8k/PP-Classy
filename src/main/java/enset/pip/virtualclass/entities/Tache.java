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
public class Tache {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id_Tache;
    String nomTache;
    Date dateDebutTache;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date dateFinTache;
    int noteMaximaleTache;
    @ManyToOne
    Publication_Projet projet;
    @OneToMany(mappedBy = "tache")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @EqualsAndHashCode.Exclude
    Set<NoteTache> notes;


}
