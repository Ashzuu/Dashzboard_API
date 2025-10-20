package ashz.dashzboard.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Entity representing a Workout, which is a collection of Exercices created by a User.
 */
@Entity
@Table(name = "workout", schema = "data")
public class Workout {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter
    @Getter
    @Column(name = "name", nullable = false)
    private String name;

    @Setter
    @Getter
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;

    // Relationship accessors
    @JsonManagedReference
    @ManyToMany
    @JoinTable(
        name = "workout_exercice",
        schema = "data",
        joinColumns = @JoinColumn(name = "workout_id"),
        inverseJoinColumns = @JoinColumn(name = "exercice_id")
    )
    private Set<Exercice> exercices = new HashSet<>();

    // Default constructor
    public Workout() {}
}
