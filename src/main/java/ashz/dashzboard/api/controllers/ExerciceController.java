package ashz.dashzboard.api.controllers;

import ashz.dashzboard.api.models.Exercice;
import ashz.dashzboard.api.services.ExerciceService;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for managing exercices.
 */
@RestController
@RequestMapping("/exercice")
public class ExerciceController {

    private final ExerciceService service;

    /**
     * Constructor of ExerciceController
     * @param service The exercice service to be used (Injection)
     */
    public ExerciceController(ExerciceService service){
        this.service = service;
    }

    /**
     * Get all exercices
     * @return An iterable of all exercices
     */
    @GetMapping("/all")
    public Iterable<Exercice> getAll(){
        return this.service.getAll();
    }

    /**
     * Insert a new exercice
     * @param exercice The exercice to be inserted
     */
    @PostMapping("/new")
    public void insert(@RequestBody Exercice exercice){
        this.service.insert(exercice);
    }
}
