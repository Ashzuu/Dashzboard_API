package ashz.dashzboard.api.services;

import ashz.dashzboard.api.models.Training;
import ashz.dashzboard.api.repository.TrainingRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {
    private final TrainingRepository repo;

    public TrainingService(TrainingRepository repo){
        this.repo = repo;
    }

    public Iterable<Training> getAll(){
        return this.repo.findAll();
    }

    public Iterable<Training> getById(long id){
        return this.repo.findAllFromUserId(id);
    }
}
