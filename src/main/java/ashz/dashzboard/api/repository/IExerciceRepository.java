package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.Exercice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExerciceRepository extends CrudRepository<Exercice, Integer> {

}
