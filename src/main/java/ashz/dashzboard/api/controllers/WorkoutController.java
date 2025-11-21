package ashz.dashzboard.api.controllers;

import ashz.dashzboard.api.models.Workout;
import ashz.dashzboard.api.models.dtos.request.RequestWorkoutDTO;
import ashz.dashzboard.api.models.dtos.response.ResponseWorkoutDTO;
import ashz.dashzboard.api.services.WorkoutService;
import ashz.dashzboard.api.services.exceptions.EntityNotFoundException;
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
    public Iterable<ResponseWorkoutDTO> getAllWorkout(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseWorkoutDTO getWorkoutById(@PathVariable int id) throws EntityNotFoundException {
        return this.service.getById(id);
    }

    @PostMapping("/new")
    public ResponseWorkoutDTO createWorkout(RequestWorkoutDTO workout){
        return this.service.create(workout);
    }
}
