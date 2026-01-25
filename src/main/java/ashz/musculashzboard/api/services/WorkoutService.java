package ashz.musculashzboard.api.services;

import ashz.musculashzboard.api.models.Workout;
import ashz.musculashzboard.api.models.dtos.request.RequestWorkoutDTO;
import ashz.musculashzboard.api.models.dtos.response.ResponseWorkoutDTO;
import ashz.musculashzboard.api.repository.WorkoutRepository;
import ashz.musculashzboard.api.services.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService  {
  private final WorkoutRepository repo;

  /**
   * Constructor for WorkoutService
   * @param repository the WorkoutRepository to be used
   */
  public WorkoutService(WorkoutRepository repository) {
    this.repo = repository;
  }

  /**
   * Get all workouts
   * @return a list of all workouts
   */
  public Iterable<ResponseWorkoutDTO> getAll() {
    List<ResponseWorkoutDTO> result = new ArrayList<>();
    for(Workout workout : this.repo.findAll()){
      result.add(new ResponseWorkoutDTO(workout));
    }
    return result;
  }

  /**
   * Get a workout by its ID
   * @param id the ID of the workout
   * @return an Optional containing the workout if found, or empty if not found
   */
  public ResponseWorkoutDTO getById(int id) throws EntityNotFoundException {
    Workout workout = this.repo.findById(id).orElseThrow(() -> new EntityNotFoundException("L'id de l'entrainement introuvable"));
    ResponseWorkoutDTO result;
    result = new ResponseWorkoutDTO(workout);
    return result;
  }

  public Iterable<ResponseWorkoutDTO> getWorkoutsByUserId(Integer userId){
    List<ResponseWorkoutDTO> result = new ArrayList<>();
    for(Workout workout : this.repo.findByUserId(userId)){
      result.add(new ResponseWorkoutDTO(workout));
    }
    return result;
  }

  public ResponseWorkoutDTO create(RequestWorkoutDTO workout){
    return new ResponseWorkoutDTO(this.repo.save(new Workout(workout)));
  }
}
