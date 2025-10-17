package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWorkoutRepository extends CrudRepository<Workout, Integer> {

}
