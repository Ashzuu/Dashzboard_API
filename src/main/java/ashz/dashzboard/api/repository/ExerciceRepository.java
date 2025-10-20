package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.Exercice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Exercice entity, implements CRUD operations.
 */
@Repository
public interface ExerciceRepository extends CrudRepository<Exercice, Integer> {

}
