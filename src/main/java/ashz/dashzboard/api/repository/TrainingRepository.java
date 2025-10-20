package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.Training;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Training entity, implements CRUD operations.
 */
@Repository
public interface TrainingRepository extends CrudRepository<Training, Long> {
    @Query("SELECT t FROM Training t WHERE t.user.id = ?1")
    Iterable<Training> findAllFromUserId(long id);
}
