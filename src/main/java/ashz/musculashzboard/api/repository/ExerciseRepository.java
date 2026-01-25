package ashz.musculashzboard.api.repository;

import ashz.musculashzboard.api.models.Exercise;
import org.hibernate.annotations.processing.Find;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Exercise entity, implements CRUD operations.
 */
@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {

}
