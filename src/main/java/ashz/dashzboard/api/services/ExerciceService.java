package ashz.dashzboard.api.services;

import ashz.dashzboard.api.models.Exercice;
import ashz.dashzboard.api.repository.IExerciceRepository;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExerciceService {
    private final IExerciceRepository repo;

    public ExerciceService(IExerciceRepository repo){
        this.repo = repo;
    }

    public Iterable<Exercice> getAll(){
        return this.repo.findAll();
    }

    public Optional<Exercice> getById(int id){
        return this.repo.findById(id);
    }
}
