package ashz.dashzboard.api.controllers;

import ashz.dashzboard.api.models.Workout;
import ashz.dashzboard.api.services.WorkoutService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
    private final WorkoutService service;

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public Iterable<Workout> getAllMusculations(){
        return this.service.getAll();
    }
}
