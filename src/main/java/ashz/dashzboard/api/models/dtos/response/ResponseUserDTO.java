package ashz.dashzboard.api.models.dtos.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseUserDTO {
    private Integer id;
    private String username;
    private String email;
}
