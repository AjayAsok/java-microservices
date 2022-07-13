package io.ajay.moviecatalogservice.models;

public class Rating {

	public String movieId;
	public long rating;

	public Rating() {
	}

	/**
	 * @param movieId
	 * @param rating
	 */
	public Rating(String movieId, long rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public long getRating() {
		return rating;
	}

	public void setRating(long rating) {
		this.rating = rating;
	}

}
