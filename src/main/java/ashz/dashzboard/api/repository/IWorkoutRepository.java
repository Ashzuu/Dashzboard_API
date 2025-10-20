package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWorkoutRepository extends CrudRepository<Workout, Integer> {

    List<Workout> findByUserId(Integer userId);
}
