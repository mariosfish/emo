package gr.army.emo.controllers;

import gr.army.emo.pojos.BathmosEntity;
import gr.army.emo.repositories.BathmosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/bathmos")
public class BathmosController {

    @Autowired
    private BathmosRepo bathmosRepo;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BathmosEntity> getAllBathmos() {
        return bathmosRepo.findAll();
    }
}
