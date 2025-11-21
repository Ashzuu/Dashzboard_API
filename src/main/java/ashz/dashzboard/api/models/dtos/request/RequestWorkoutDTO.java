package ashz.dashzboard.api.models.dtos.request;

import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestWorkoutDTO {
    @Nullable
    private String name;
    @Nullable
    private RequestExerciseDTO exercises;
    private RequestUserDTO user;
}

