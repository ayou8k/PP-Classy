package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Publication_Devoir extends Publication_Cours {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    Date dateDebutDevoir;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    Date durreeDevoir;
    int noteMaximaleDevoir;
    @OneToMany(mappedBy = "devoir")
    Set<NoteDevoir> notes;
}
