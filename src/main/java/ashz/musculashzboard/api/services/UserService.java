package ashz.musculashzboard.api.services;

import ashz.musculashzboard.api.models.User;
import ashz.musculashzboard.api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;

    /**
     * Constructor of the user service
     * @param repo Inject repository
     */
    public UserService(UserRepository repo){
        this.repo = repo;
    }

    /**
     * Persist data user to database with hash of password
     * @param user The user to persist.
     */
    public void save(User user){
        this.repo.save(user);
    }

    /**
     * Find a user by the username, using UserRepository
     * @param username The username to search
     * @return The User which corresponds to the username given
     */
    public User findByUsername(String username){
        return this.repo.findByUsername(username);
    }
}
