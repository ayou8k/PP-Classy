package enset.pip.virtualclass;

import enset.pip.virtualclass.dao.*;
import enset.pip.virtualclass.entities.*;
import enset.pip.virtualclass.entities.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class VirtualclassApplication implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantRepositoryImpl=null;
    @Autowired
    DiplomeRepository diplomeRepositoryImpl=null;
    @Autowired
    Publication_DevoirRepository publication_devoirRepositoryImpl=null;
    @Autowired
    NoteDevoirRepository noteDevoirRepositoryImpl=null;
    @Autowired
    TacheRepository tacheRepositoryImpl=null;
    @Autowired
    Publication_ProjetRepository publication_projetRepositoryImpl=null;
    @Autowired
    GroupeRepository groupeRepositoryImpl=null;
    @Autowired
    NoteTacheRepository noteTacheRepositoryImpl=null;

    public static void main(String[] args) {
        SpringApplication.run(VirtualclassApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dt=new SimpleDateFormat("HH:mm");
        Etudiant student1=new Etudiant();
        student1.setId("F137318699");
        student1.setEmail("mrayoub98@gmail.com");
        student1.setNom("BK");
        student1.setPrenom("Ayoub");
        student1.setTel("0681544727");
        Diplome diplome=new Diplome();
        diplome.setDateObtention(df.parse("23/06/2018"));
        diplome.setFiliere("Gi");
        diplome.setMention("Tres Bien");
        diplome.setNom("DUT");
//        diplome.setEtudiant(e1);
        diplomeRepositoryImpl.save(diplome);
        student1.setDiplome(diplome);
        etudiantRepositoryImpl.save(student1);
        Etudiant e2=new Etudiant();
        e2.setId("1423457698");
        e2.setEmail("yahyakharazzi@gmail.com");
        e2.setNom("KZ");
        e2.setPrenom("Yahya");
        e2.setTel("0681544722");
        Diplome diplome2=new Diplome();
        diplome2.setDateObtention(df.parse("23/06/2018"));
        diplome2.setFiliere("Gi");
        diplome2.setMention("Tres Bien");
        diplome2.setNom("DUT");
//        diplome.setEtudiant(e1);
        diplomeRepositoryImpl.save(diplome2);
        e2.setDiplome(diplome2);
        etudiantRepositoryImpl.save(e2);
//        Module module1=new Module();
//        module1.setDesignation("OOP-UML");
//        Element_module element_module1=new Element_module();
//        element_module1.setCoeficient("50%");
//        element_module1.setDesignation("JAVA");
//        element_module1.setModule(module1);
//        Element_module element_module2=new Element_module();
//        element_module2.setCoeficient("50%");
//        element_module2.setModule(module1);
        Publication_Devoir d1=new Publication_Devoir();
        d1.setTitre("Devoir Java");
        d1.setContenu("Ceci est le devoir n1");
        d1.setDatePublication(df.parse("21/1/1982"));
        d1.setDateDebutDevoir(df.parse("21/1/1982"));
        d1.setDurreeDevoir(dt.parse("01:00"));
        d1.setNoteMaximaleDevoir(20);
        d1.setPieces_jointes("TEST.pdf");
        publication_devoirRepositoryImpl.save(d1);



        NoteDevoirCle noteDevoirCle=new NoteDevoirCle();
        noteDevoirCle.setEtudiantId(student1.getId());
        noteDevoirCle.setDevoirId(d1.getId());


        NoteDevoir noteDevoir1e1=new NoteDevoir();
        noteDevoir1e1.setId(noteDevoirCle);
        noteDevoir1e1.setEtudiant(student1);
        noteDevoir1e1.setDevoir(d1);
        noteDevoir1e1.setNote(17);
        noteDevoirRepositoryImpl.save(noteDevoir1e1);

        Publication_Projet projet1=new Publication_Projet();
        projet1.setNoteMaximaleProjet(20);
        projet1.setDateDebutProjet(df.parse("01/10/2020"));
        projet1.setDateFinProjet(df.parse("01/12/2020"));
        projet1.setNbTaches(2);
        projet1.setPieces_jointes("DescriptifProjet-CahierDesCharges.docx");
        projet1.setTitre("Projet MAgasin");
        projet1.setContenu("un magasinier vous demande de faire une app");
        projet1.setDatePublication(df.parse("31/09/2020"));
        publication_projetRepositoryImpl.save(projet1);


        Tache tache1projet=new Tache();
        tache1projet.setNoteMaximaleTache(3);
        tache1projet.setNomTache("Gestion Produit");
        tache1projet.setProjet(projet1);
        tache1projet.setDateDebutTache(df.parse("02/10/2020"));
        tache1projet.setDateFinTache(df.parse("12/10/2020"));


        Tache tache2projet=new Tache();
        tache2projet.setNoteMaximaleTache(3);
        tache2projet.setNomTache("Gestion Client");
        tache2projet.setProjet(projet1);
        tache2projet.setDateDebutTache(df.parse("12/10/2020"));
        tache2projet.setDateFinTache(df.parse("22/10/2020"));

        tacheRepositoryImpl.save(tache1projet);
        tacheRepositoryImpl.save(tache2projet);





        Groupe groupe=new Groupe();
        groupe.setNom("Toddlers");
        groupe.setDateCreation("01/01/2030");
        groupeRepositoryImpl.save(groupe);

        //persist

        NoteTacheCle noteTache1Cle=new NoteTacheCle();
        noteTache1Cle.setTacheId(tache1projet.getId_Tache());
        noteTache1Cle.setGroupeId(groupe.getId());

        NoteTacheCle noteTache2Cle=new NoteTacheCle();
        noteTache2Cle.setTacheId(tache2projet.getId_Tache());
        noteTache2Cle.setGroupeId(groupe.getId());
        //Persist

        NoteTache noteTache1=new NoteTache();
        noteTache1.setNote(2);
        noteTache1.setId(noteTache1Cle);
        //maybe more
        NoteTache noteTache2=new NoteTache();
        noteTache2.setNote(2);
        noteTache2.setId(noteTache2Cle);
        //maybe more

        noteTacheRepositoryImpl.save(noteTache1);
        noteTacheRepositoryImpl.save(noteTache2);

    }
}