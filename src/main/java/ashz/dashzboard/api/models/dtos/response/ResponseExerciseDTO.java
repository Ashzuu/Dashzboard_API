package ashz.dashzboard.api.models.dtos.response;

import ashz.dashzboard.api.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseExerciseDTO {
    private Number id;
    private String name;
    private String muscular_group;
    private User user;
}
