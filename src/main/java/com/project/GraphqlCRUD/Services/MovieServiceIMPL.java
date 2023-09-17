package com.project.GraphqlCRUD.Services;

import com.project.GraphqlCRUD.Entity.Movie;
import com.project.GraphqlCRUD.Errors.CustomError;
import com.project.GraphqlCRUD.Repository.MovieRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class MovieServiceIMPL implements MovieService{


    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie add(Movie movie) {
        log.info("ADDING MOVIE...");
        movieRepository.save(movie);
        return movie;
    }

    @Override
    public List<Movie> showAll() {
        log.info("SHOWING ALL MOVIES");
        return new ArrayList<>(movieRepository.findAll());
    }

    @Override
    public Movie show(Long movieId) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(()->new CustomError("THE MOVIE ID IS INVALID","Try Entering A different Id"));
        return movie;
    }
}
