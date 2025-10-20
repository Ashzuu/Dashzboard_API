package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Workout entity, implements CRUD operations.
 */
@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Integer> {

    List<Workout> findByUserId(Integer userId);
}
