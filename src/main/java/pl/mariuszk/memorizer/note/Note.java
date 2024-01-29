package pl.mariuszk.memorizer.note;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import pl.mariuszk.memorizer.collection.Collection;

@Entity
@Table(name = "NOTES")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CONTENTS")
    @NotNull
    private String contents;

    @Column(name = "DISTRIBUTION_NUMBER")
    @NotNull
    private Integer distributionNumber = 0;

    @ManyToOne
    @JoinColumn(name = "COLLECTION_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @NotNull
    private Collection collection;
}
