package ashz.dashzboard.api.services;

import ashz.dashzboard.api.models.Exercice;
import ashz.dashzboard.api.repository.ExerciceRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

/**
 * Service class for managing Exercice entities.
 */
@Service
public class ExerciceService {
    private final ExerciceRepository repo;

    /**
     * Constructor for ExerciceService.
     * @param repo The ExerciceRepository instance (Injection).
     */
    public ExerciceService(ExerciceRepository repo){
        this.repo = repo;
    }

    /**
     * Get all Exercice entities.
     * @return An iterable collection of all Exercice entities.
     */
    public Iterable<Exercice> getAll(){
        return this.repo.findAll();
    }

    /**
     * Get an Exercice by its ID.
     * @param id The ID of the Exercice.
     * @return An Optional containing the Exercice if found, or empty if not found.
     */
    public Optional<Exercice> getById(int id){
        return this.repo.findById(id);
    }

    /**
     * Insert a new Exercice entity.
     * @param exercice The Exercice entity to insert.
     */
    public void insert(@RequestBody Exercice exercice){
        this.repo.save(exercice);
    }
}
