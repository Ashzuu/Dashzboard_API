package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Exercise entity, implements CRUD operations.
 */
@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {

}
