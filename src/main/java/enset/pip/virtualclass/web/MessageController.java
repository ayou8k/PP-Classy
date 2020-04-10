package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.MessageRepository;
import enset.pip.virtualclass.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MessageController {
    @Autowired
    private MessageRepository messageRepository;
    @GetMapping(value = "/listMessages")
    public List<Message> listMessages()
    {
        return messageRepository.findAll();
    }

    @GetMapping(value = "listMessages/{id}")
    public Message listMessages(@PathVariable(name="id") Long id)
    {
        return messageRepository.findById(id).orElse(null);
    }
    @PutMapping(value = "listMessages/{id}")
    public Message Update(@PathVariable(name="id") Long id, @RequestBody Message e)
    {
        e.setId(id);
        return messageRepository.save(e);
    }
    @PostMapping(value = "listMessages/")
    public Message save(@RequestBody Message e)
    {
        return messageRepository.save(e);
    }
    @DeleteMapping(value = "listMessages/{id}")
    public void delete(@PathVariable(name="id") Long id)
    {
        messageRepository.deleteById(id);
    }
}
