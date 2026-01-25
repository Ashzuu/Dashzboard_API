package ashz.musculashzboard.api.services;

import ashz.musculashzboard.api.models.Training;
import ashz.musculashzboard.api.repository.TrainingRepository;
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
