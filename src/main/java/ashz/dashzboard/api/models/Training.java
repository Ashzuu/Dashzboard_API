package ashz.dashzboard.api.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

/**
 * Entity representing a Training, which is a session of a Workout performed by a User.
 */
@Getter
@Entity
@Table(name = "training", schema = "data")
public class Training {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Temporal(TemporalType.DATE)
    @Column(name = "session_date", nullable = false)
    private Date session_date;

    @ManyToOne
    private User user;

    @ManyToOne
    private Workout workout;

    @JsonManagedReference
    @OneToMany(mappedBy = "training")
    private Set<TrainingSession> trainingSessions;
}
