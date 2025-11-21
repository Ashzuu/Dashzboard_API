package ashz.dashzboard.api.models.auth;
import lombok.Data;

/**
 * Represents the request when a user want to connect him.
 */
@Data
public class AuthRequest {
    private String username;
    private String password;
}
