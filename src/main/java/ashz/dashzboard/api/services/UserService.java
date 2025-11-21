package ashz.dashzboard.api.services;

import ashz.dashzboard.api.models.User;
import ashz.dashzboard.api.repository.UserRepository;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;
    private final PasswordEncoder encoder;

    /**
     * Constructor of the user service
     * @param repo Inject repository
     * @param encoder Password encoder
     */
    public UserService(UserRepository repo, PasswordEncoder encoder){
        this.repo = repo;
        this.encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
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
