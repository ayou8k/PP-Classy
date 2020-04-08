package enset.pip.virtualclass.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    Publication_Devoir devoir;
    @ManyToOne
    @MapsId("etudiant_id")
    @JoinColumn(name = "etudiant_id")
    Etudiant etudiant;
    int note;
}
