package ashz.musculashzboard.api.services;

import ashz.musculashzboard.api.models.Exercise;
import ashz.musculashzboard.api.repository.ExerciseRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

/**
 * Service class for managing Exercise entities.
 */
@Service
public class ExerciseService {
    private final ExerciseRepository repo;

    /**
     * Constructor for ExerciseService.
     * @param repo The ExerciseRepository instance (Injection).
     */
    public ExerciseService(ExerciseRepository repo){
        this.repo = repo;
    }

    /**
     * Get all Exercise entities.
     * @return An iterable collection of all Exercise entities.
     */
    public Iterable<Exercise> getAll(){
        return this.repo.findAll();
    }

    /**
     * Get an Exercise by its ID.
     * @param id The ID of the Exercise.
     * @return An Optional containing the Exercise if found, or empty if not found.
     */
    public Optional<Exercise> getById(int id){
        return this.repo.findById(id);
    }

    /**
     * Insert a new Exercise entity.
     * @param exercise The Exercise entity to insert.
     */
    public void insert(@RequestBody Exercise exercise){
        this.repo.save(exercise);
    }
}
