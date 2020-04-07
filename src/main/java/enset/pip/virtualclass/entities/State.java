package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class State {
    @Id
    @GeneratedValue
    private Long Id;

    private String nom;

    @OneToMany(mappedBy = "state")
    private Set<Publication> publications;

    @ManyToOne
    @JoinColumn
    private Comment comment;

}
