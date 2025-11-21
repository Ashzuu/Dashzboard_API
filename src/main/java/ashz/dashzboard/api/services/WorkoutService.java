package ashz.dashzboard.api.services;

import ashz.dashzboard.api.models.Workout;
import ashz.dashzboard.api.models.dtos.request.RequestWorkoutDTO;
import ashz.dashzboard.api.models.dtos.response.ResponseWorkoutDTO;
import ashz.dashzboard.api.repository.WorkoutRepository;
import ashz.dashzboard.api.services.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
