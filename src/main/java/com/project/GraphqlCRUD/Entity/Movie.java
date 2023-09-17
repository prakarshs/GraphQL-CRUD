package com.project.GraphqlCRUD.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "MOVIE_DETAILS")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieId;
    @Column(name = "MOVIE_NAME")
    private String movieName;
    @Column(name = "MOVIE_DIRECTOR")
    private String movieDirector;
    @Column(name = "MOVIE_YEAR")
    private Long movieYear;
    @Column(name = "MOVIE_RATING")
    private int movieRating;


}
