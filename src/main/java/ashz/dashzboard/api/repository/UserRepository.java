package ashz.dashzboard.api.repository;

import ashz.dashzboard.api.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for Training entity, implements CRUD operations.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
