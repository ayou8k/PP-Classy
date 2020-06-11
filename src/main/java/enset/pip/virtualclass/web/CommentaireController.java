package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.CommentaireRepository;
import enset.pip.virtualclass.entities.Commentaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CommentaireController {
    @Autowired
    private CommentaireRepository commentaireRepository;

    @GetMapping(value = "/listCommentaires")
    public List<Commentaire> listCommentaire() {
        return commentaireRepository.findAll();
    }

    @GetMapping(value = "GetCommentaire/{id}")
    public Commentaire listCommentaire(@PathVariable(name = "id") Long id) {
        return commentaireRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateCommentaire/{id}")
    public Commentaire Update(@PathVariable(name = "id") Long id, @RequestBody Commentaire e) {
        e.setId(id);
        return commentaireRepository.save(e);
    }

    @PostMapping(value = "CreateCommentaire/")
    public Commentaire save(@RequestBody Commentaire e) {
        return commentaireRepository.save(e);
    }

    @DeleteMapping(value = "DeleteCommentaire/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        commentaireRepository.deleteById(id);
    }
}
