package enset.pip.virtualclass.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NoteTache {
    @EmbeddedId
    NoteTacheCle id;
    @ManyToOne
    @MapsId("tache_id")
    @JoinColumn(name = "tache_id")
    Tache tache;
    @ManyToOne
    @MapsId("groupe_id")
    @JoinColumn(name = "groupe_id")
    Groupe groupe;
    int note;
}
