package enset.pip.virtualclass.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NoteDevoir {
    @EmbeddedId
    NoteDevoirCle id;
    @ManyToOne
    @MapsId("devoir_id")
    @JoinColumn(name = "devoir_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @EqualsAndHashCode.Exclude Publication_Devoir devoir;
    @ManyToOne
    @MapsId("etudiant_id")
    @JoinColumn(name = "etudiant_id")
    Etudiant etudiant;
    int note;
}
