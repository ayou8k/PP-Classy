package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.NoteDevoirRepository;
import enset.pip.virtualclass.entities.NoteDevoir;
import enset.pip.virtualclass.entities.NoteDevoirCle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class NoteDevoirController {
    @Autowired
    private NoteDevoirRepository noteDevoirRepository;

    @GetMapping(value = "/listNoteDevoirs")
    public List<NoteDevoir> listNoteDevoirs() {
        return noteDevoirRepository.findAll();
    }

    @GetMapping(value = "GetNoteDevoir/{id}")
    public NoteDevoir listNoteDevoirs(@PathVariable(name = "id") NoteDevoirCle id) {
        return noteDevoirRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateNoteDevoir/{id}")
    public NoteDevoir Update(@PathVariable(name = "id") NoteDevoirCle id, @RequestBody NoteDevoir e) {
        e.setId(id);
        return noteDevoirRepository.save(e);
    }

    @PostMapping(value = "CreateNoteDevoir/")
    public NoteDevoir save(@RequestBody NoteDevoir e) {
        return noteDevoirRepository.save(e);
    }

    @DeleteMapping(value = "DeleteNoteDevoir/{id}")
    public void delete(@PathVariable(name = "id") NoteDevoirCle id) {
        noteDevoirRepository.deleteById(id);
    }
}
