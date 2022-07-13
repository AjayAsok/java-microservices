package io.ajay.movieinfoservice.resources;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ajay.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movie")
public class MovieInfoResource {
	@RequestMapping("/{movieId}")
	public Movie getMovies(@PathVariable("movieId") String movieId) {
//		List<Movie> movies = new ArrayList<Movie>();
//		movies.add(new Movie("123", "desc"));
//		movies.add(new Movie("456", "desc2"));
		return new Movie(movieId, "desc2");
	}
}
