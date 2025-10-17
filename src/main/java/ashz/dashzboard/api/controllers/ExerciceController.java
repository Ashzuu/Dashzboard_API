package ashz.dashzboard.api.controllers;

import ashz.dashzboard.api.models.Exercice;
import ashz.dashzboard.api.services.ExerciceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercice")
public class ExerciceController {

    private final ExerciceService service;

    public ExerciceController(ExerciceService service){
        this.service = service;
    }

    @GetMapping("/all")
    public Iterable<Exercice> getAll(){
        return this.service.getAll();
    }
}
