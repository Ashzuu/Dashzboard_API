package ashz.dashzboard.api.controllers;

import ashz.dashzboard.api.models.Training;
import ashz.dashzboard.api.services.TrainingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for managing trainings.
 */
@RestController
@RequestMapping("/training")
public class TrainingController {

    private final TrainingService service;

    /**
     * Constructor of TrainingController
     * @param service The training service to be used (Injection)
     */
    public TrainingController(TrainingService service){
        this.service = service;
    }

    /**
     * Get all trainings
     * @return An iterable of all trainings
     */
    @GetMapping("/all")
    public Iterable<Training> getAllTrainings(){
        return this.service.getAll();
    }

    /**
     * Get trainings by user id
     * @param id The user id
     * @return An iterable of trainings for the given user id
     */
    @GetMapping("/{id}")
    public Iterable<Training> getTrainingById(@PathVariable long id){
        return this.service.getById(id);
    }
}
