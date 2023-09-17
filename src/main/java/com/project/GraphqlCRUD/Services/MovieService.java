package com.project.GraphqlCRUD.Services;

import com.project.GraphqlCRUD.Entity.Movie;

import java.util.List;

public interface MovieService {

    Movie add(Movie movie);
    List<Movie> showAll();
    Movie show(Long movieId);
}
