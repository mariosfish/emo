package gr.army.emo.controllers;

import gr.army.emo.pojos.DikaiologitikoEntity;
import gr.army.emo.repositories.DikaiologitikaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/dikaiologitiko/")
public class DikaiologitikaController {

    @Autowired
    private DikaiologitikaRepo dikaiologitikaRepo;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DikaiologitikoEntity> getAllDikailogitika() {
        return dikaiologitikaRepo.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "add")
    public void addDikaiologitiko(@RequestBody String dikaiologitiko) {
        DikaiologitikoEntity dk = new DikaiologitikoEntity(dikaiologitiko);
        dikaiologitikaRepo.save(dk);
    }
}
