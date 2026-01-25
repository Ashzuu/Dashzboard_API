package ashz.musculashzboard.api.models.dtos.response;

import ashz.musculashzboard.api.models.User;
import ashz.musculashzboard.api.models.Workout;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseWorkoutDTO {
    private Number id;
    private String name;
    private User user;

    public ResponseWorkoutDTO(Workout workout){
        this.id = workout.getId();
        this.name = workout.getName();
        this.user = workout.getUser();

    }
}
