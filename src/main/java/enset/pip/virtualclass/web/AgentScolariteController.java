package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.AgentScolariteRepository;
import enset.pip.virtualclass.entities.AgentScolarite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentScolariteController {
    @Autowired
    private AgentScolariteRepository agentScolariteRepository;

    @GetMapping(value = "/listAgentScolarites")
    public List<AgentScolarite> listAgentScolarite() {
        return agentScolariteRepository.findAll();
    }

    @GetMapping(value = "GetAgentScolarite/{id}")
    public AgentScolarite listAgentScolarite(@PathVariable(name = "id") Long id) {
        return agentScolariteRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateAgentScolarite/{id}")
    public AgentScolarite Update(@PathVariable(name = "id") Long id, @RequestBody AgentScolarite e) {
        e.setId(id);
        return agentScolariteRepository.save(e);
    }

    @PostMapping(value = "CreateAgentScolarite/")
    public AgentScolarite save(@RequestBody AgentScolarite e) {
        return agentScolariteRepository.save(e);
    }

    @DeleteMapping(value = "DeleteAgentScolarite/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        agentScolariteRepository.deleteById(id);
    }
}
