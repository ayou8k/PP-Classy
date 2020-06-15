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
public class Publication_Devoir {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    String titre;
    String contenu;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date datePublication;
    String pieces_jointes;
    //ELEMENT MODULE
    @ManyToOne
    @EqualsAndHashCode.Exclude
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    Element_module element_module;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date dateDebutDevoir;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    Date durreeDevoir;
    int noteMaximaleDevoir;
    @OneToMany(mappedBy = "devoir")
    Set<NoteDevoir> notes;
}
