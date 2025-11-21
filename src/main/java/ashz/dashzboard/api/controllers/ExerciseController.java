package ashz.dashzboard.api.controllers;

import ashz.dashzboard.api.models.Exercise;
import ashz.dashzboard.api.services.ExerciseService;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for managing exercises.
 */
@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    private final ExerciseService service;

    /**
     * Constructor of ExerciseController
     * @param service The exercise service to be used (Injection)
     */
    public ExerciseController(ExerciseService service){
        this.service = service;
    }

    /**
     * Get all exercises
     * @return An iterable of all exercises
     */
    @GetMapping("/all")
    public Iterable<Exercise> getAll(){
        return this.service.getAll();
    }

    /**
     * Insert a new exercise
     * @param exercise The exercise to be inserted
     */
    @PostMapping("/new")
    public void insert(@RequestBody Exercise exercise){
        this.service.insert(exercise);
    }
}
