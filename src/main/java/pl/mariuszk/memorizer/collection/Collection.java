package pl.mariuszk.memorizer.collection;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import pl.mariuszk.memorizer.note.Note;
import pl.mariuszk.memorizer.user.User;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "COLLECTIONS")
@Data
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @Column(name = "DISTRIBUTION_TIME_UTC")
    private LocalTime distributionTimeUTC;

    @Column(name = "DISTRIBUTION_SERIES")
    @NotNull
    private Integer distributionSeries = 1;

    @ManyToOne
    @JoinColumn(name = "OWNER_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @NotNull
    private User owner;

    @OneToMany(mappedBy = "collection")
    private List<Note> notes;
}
