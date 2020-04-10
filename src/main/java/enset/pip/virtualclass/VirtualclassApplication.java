package enset.pip.virtualclass;

import enset.pip.virtualclass.dao.AgentScolariteRepository;
import enset.pip.virtualclass.dao.CategorieRepository;
import enset.pip.virtualclass.dao.EtudiantRepository;
import enset.pip.virtualclass.entities.Categorie;
import enset.pip.virtualclass.entities.Classe;
import enset.pip.virtualclass.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirtualclassApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private AgentScolariteRepository agentScolariteRepository;

    public static void main(String[] args) {
        SpringApplication.run(VirtualclassApplication.class, args);
    }

    @Override
//    Classe classe = new Classe(null,"BDCC",)
    public void run(String... args) {
//        etudiantRepository.save(new Etudiant(null,"saad","haddadi","email@gmail.com","0678180586",null,null,classe));
        etudiantRepository.findAll();
        agentScolariteRepository.findAll();

    }
}
