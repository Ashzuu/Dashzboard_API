package ashz.dashzboard.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Entity representing a User of the application.
 */
@Setter
@Getter
@Entity
@Table(name = "userapp", schema = "data")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @JsonIgnore
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @JsonIgnore
    @Column(name="password", nullable=false)
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Training> trainings;
}
