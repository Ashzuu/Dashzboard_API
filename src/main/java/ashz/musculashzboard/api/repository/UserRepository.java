package ashz.musculashzboard.api.repository;

import ashz.musculashzboard.api.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for Training entity, implements CRUD operations.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
