package ashz.dashzboard.api.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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
