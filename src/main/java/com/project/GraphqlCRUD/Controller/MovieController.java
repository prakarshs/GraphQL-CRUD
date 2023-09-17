package com.project.GraphqlCRUD.Controller;

import com.project.GraphqlCRUD.Entity.Movie;
import com.project.GraphqlCRUD.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<Movie> add(@RequestBody Movie movie)
    {
        return new ResponseEntity<>(movieService.add(movie), HttpStatus.OK);
    }

    @GetMapping("/show/{movieId}")
    public ResponseEntity<Movie> show(@PathVariable Long movieId)
    {
        return new ResponseEntity<>(movieService.show(movieId), HttpStatus.OK);
    }

    @GetMapping("/showAll")
    public ResponseEntity<List<Movie>> showAll()
    {
        return new ResponseEntity<>(movieService.showAll(), HttpStatus.OK);
    }
}
