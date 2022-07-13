package io.ajay.ratingdataservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ajay.ratingdataservice.models.Rating;

@RestController
@RequestMapping("/rating")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public List<Rating> getRatings(@PathVariable("movieId") String movieId) {
		List<Rating> ratings = new ArrayList<>();
		ratings.add(new Rating(movieId, 5));
		return ratings;
	}

}
