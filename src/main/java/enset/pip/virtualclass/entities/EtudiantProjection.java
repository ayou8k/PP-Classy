package enset.pip.virtualclass.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="E1", types = Etudiant.class)
public interface EtudiantProjection {
     String getNom();
}
