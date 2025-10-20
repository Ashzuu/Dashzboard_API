package ashz.dashzboard.api.services;

import ashz.dashzboard.api.models.Workout;
import ashz.dashzboard.api.repository.IWorkoutRepository;
import org.hibernate.annotations.processing.Find;
import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService  {
    private final IWorkoutRepository repo;

    /**
     * Constructor for WorkoutService
     * @param repository the WorkoutRepository to be used
     */
    public WorkoutService(IWorkoutRepository repository) {
        this.repo = repository;
    }

    /**
     * Get all workouts
     * @return a list of all workouts
     */
    public Iterable<Workout> getAll() {
        return this.repo.findAll();
    }

    /**
     * Get a workout by its ID
     * @param id the ID of the workout
     * @return an Optional containing the workout if found, or empty if not found
     */
    public Optional<Workout> getById(Integer id) {
        return this.repo.findById(id);
    }

    public List<Workout> getWorkoutsByUserId(Integer userId){
        return this.repo.findByUserId(userId);
    }
}
