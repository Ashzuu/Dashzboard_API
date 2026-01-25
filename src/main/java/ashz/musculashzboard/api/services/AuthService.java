package ashz.musculashzboard.api.services;

import ashz.musculashzboard.api.models.auth.AuthRequest;
import ashz.musculashzboard.api.models.auth.AuthResponse;
import org.springframework.stereotype.Service;


@Service
public class AuthService {
    private final UserService service;

    public AuthService(UserService service){
        this.service = service;
    }

    public AuthResponse login(AuthRequest credentials) throws Exception {

        return new AuthResponse();
    }

    public AuthResponse register(AuthRequest credentials){
        AuthResponse res = new AuthResponse();
        return res;
    }

    private boolean checkExistingToken(AuthRequest credentials){
        return false;
    }

    private boolean checkCompatibility(AuthRequest credentials){
        return false;
    }

    private String createToken(AuthRequest credentials){
        return "";
    }

    private boolean checkIfUsernameExists(String username){
        return true;
    }

}
