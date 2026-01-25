package ashz.musculashzboard.api.controllers;

import ashz.musculashzboard.api.models.dtos.request.RequestWorkoutDTO;
import ashz.musculashzboard.api.models.dtos.response.ResponseWorkoutDTO;
import ashz.musculashzboard.api.services.WorkoutService;
import ashz.musculashzboard.api.services.exceptions.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Get workout by id
     * @param id The workout id
     * @return The workout with the given id
     * @throws EntityNotFoundException If the workout with the given id does not exist
     */
    @GetMapping("/{id}")
    public ResponseWorkoutDTO getWorkoutById(@PathVariable int id) throws EntityNotFoundException {
        return this.service.getById(id);
    }

    /**
     * Create a new workout
     * @param workout The workout to be created
     * @return The created workout
     */
    @PostMapping("/new")
    public ResponseWorkoutDTO createWorkout(@RequestBody RequestWorkoutDTO workout){
        return this.service.create(workout);
    }
}
