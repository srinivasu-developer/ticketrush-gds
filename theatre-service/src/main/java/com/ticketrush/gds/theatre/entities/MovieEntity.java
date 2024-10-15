package com.ticketrush.gds.theatre.entities;

import com.ticketrush.gds.theatre.enums.MovieGenre;
import com.ticketrush.gds.theatre.enums.MovieLanguage;
import jakarta.persistence.*;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "movies")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "language", nullable = false)
    private MovieLanguage language;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre", nullable = false)
    private MovieGenre genre;


    @Column(name = "release_date", columnDefinition = "DATE", nullable = false)
    private LocalDate releaseDate;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    @JsonIgnore
    @Builder.Default
    private List<ShowEntity> shows = new ArrayList<>();
}