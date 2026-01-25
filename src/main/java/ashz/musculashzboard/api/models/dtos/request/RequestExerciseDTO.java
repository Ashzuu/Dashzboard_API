package ashz.musculashzboard.api.models.dtos.request;

import ashz.musculashzboard.api.models.User;
import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestExerciseDTO {
    @Nullable
    private Number id;
    @Nullable
    private String name;
    @Nullable
    private String muscular_group;
    private User user;
}