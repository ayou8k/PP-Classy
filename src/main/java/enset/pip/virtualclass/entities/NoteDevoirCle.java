package enset.pip.virtualclass.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NoteDevoirCle implements Serializable {
    @Column(name = "devoir_id")
    Long devoirId;

    @Column(name = "etudiant_id")
    String etudiantId;
}
