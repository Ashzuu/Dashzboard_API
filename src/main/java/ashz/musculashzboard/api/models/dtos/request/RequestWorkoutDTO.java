package ashz.musculashzboard.api.models.dtos.request;

import ashz.musculashzboard.api.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestWorkoutDTO {
    @Nullable
    @JsonProperty("name")
    private String name;
    @JsonProperty("user")
    private User user;
}

