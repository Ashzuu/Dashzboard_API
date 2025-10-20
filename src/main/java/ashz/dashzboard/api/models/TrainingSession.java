package ashz.dashzboard.api.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity representing a Training session (An exercice in the context of a training).
 */
@Entity
@Table(name = "training_session", schema = "data")
@Getter
@Setter
public class TrainingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reps", nullable = false)
    private int reps;

    @Column(name = "weight", nullable = false)
    private double weight;

    @ManyToOne
    @JsonBackReference
    private Training training;

    @ManyToOne
    private Exercice exercice;
}
