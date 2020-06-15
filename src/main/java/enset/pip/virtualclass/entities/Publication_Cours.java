package enset.pip.virtualclass.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Inheritance(
//        strategy = InheritanceType.JOINED
//)
public class Publication_Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String titre;
    String contenu;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date datePublication;
    String pieces_jointes;
    //ELEMENT MODULE
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @EqualsAndHashCode.Exclude
    Element_module element_module;

}
