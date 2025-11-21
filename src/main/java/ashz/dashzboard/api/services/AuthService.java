package ashz.dashzboard.api.services;

import ashz.dashzboard.api.models.auth.AuthRequest;
import ashz.dashzboard.api.models.auth.AuthResponse;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class AuthService {
    private final UserService service;
    private final PasswordEncoder encoder;
    
    public AuthService(UserService service){
        this.service = service;
        this.encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
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
