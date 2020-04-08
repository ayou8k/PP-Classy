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
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    Long id;
    String Contenu_msg;
    @ManyToOne
    @JoinColumn
    private Group group;

    @ManyToOne
    @JoinColumn
    private Compte compte;
}
