package com.project.GraphqlCRUD.Controller;

import com.project.GraphqlCRUD.Entity.Movie;
import com.project.GraphqlCRUD.Models.MovieRequest;
import com.project.GraphqlCRUD.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class MovieGraphQLController {

    @Autowired
    private MovieService movieService;
    @MutationMapping("addMovies")
    public Movie add(@Argument MovieRequest movieRequest)
    {
        Movie movie = Movie.builder()
                .movieName(movieRequest.getMovieName())
                .movieDirector(movieRequest.getMovieDirector())
                .movieYear(movieRequest.getMovieYear())
                .movieRating(movieRequest.getMovieRating()).build();

        return movieService.add(movie);
    }

    @QueryMapping("showMovie")
    public Movie show(@Argument Long movieId)
    {
        return movieService.show(movieId);
    }

    @QueryMapping("allMovies")
    public List<Movie> showAll()
    {
        return movieService.showAll();
    }

    @MutationMapping("removeMovie")
    public List<Movie> remove(@Argument Long movieId)
    {
        return movieService.remove(movieId);
    }
}
