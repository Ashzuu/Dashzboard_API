package ashz.dashzboard.api.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Entity representing an Exercise.
 */
@Entity
@Table(name = "exercise", schema = "data")
public class Exercise {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter
    @Getter
    @Column(nullable = false)
    private String name;

    @Setter
    @Getter
    @Column(name = "muscular_group", nullable = false)
    private String muscularGroup;

    @JsonBackReference
    @ManyToMany(mappedBy = "exercises")
    private Set<Workout> workouts = new HashSet<>();

    @OneToMany
    @JsonIgnore
    private Set<TrainingSession> trainingSessions = new HashSet<>();
}
