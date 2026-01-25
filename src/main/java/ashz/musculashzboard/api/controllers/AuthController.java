package ashz.musculashzboard.api.controllers;

import ashz.musculashzboard.api.models.auth.AuthRequest;
import ashz.musculashzboard.api.models.auth.AuthResponse;
import ashz.musculashzboard.api.services.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService service;

    /**
     * Constructor to initialize Auth Service in Auth Controller
     * @param service The service linked to the controller which manage the authentication
     */
    public AuthController(AuthService service){
        this.service = service;
    }

    @PostMapping("/login")
    public AuthResponse Login(@RequestBody AuthRequest credentials) throws Exception {
        return this.service.login(credentials);
    }
}
