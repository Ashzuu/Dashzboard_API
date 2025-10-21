package ashz.dashzboard.api.controllers;

import ashz.dashzboard.api.models.Workout;
import ashz.dashzboard.api.services.WorkoutService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Controller for managing workouts.
 */
@RestController
@RequestMapping("/workout")
public class WorkoutController {
    private final WorkoutService service;

    /**
     * Constructor of WorkoutController
     * @param service The workout service to be used (Injection)
     */
    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    /**
     * Get all workouts
     * @return An iterable of all workouts
     */
    @GetMapping("/all")
    public Iterable<Workout> getAllWorkout(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Workout> getWorkoutById(@PathVariable int id) {
        return this.service.getById(id);
    }
}
