package ashz.dashzboard.api.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exercice", schema = "data")
public class Exercice {
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
    @ManyToMany(mappedBy = "exercices")
    private Set<Workout> workouts = new HashSet<>();
}
