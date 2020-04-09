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
public class NoteTacheCle implements Serializable {
    @Column(name = "tache_id")
    Long tacheId;

    @Column(name = "groupe_id")
    Long groupeId;
}
