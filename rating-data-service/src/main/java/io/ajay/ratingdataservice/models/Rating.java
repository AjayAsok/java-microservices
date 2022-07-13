/**
 * 
 */
package io.ajay.ratingdataservice.models;

/**
 * @author 40119273
 *
 */
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
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getReatingId() {
		return movieId;
	}

	public void setReatingId(String movieId) {
		this.movieId = movieId;
	}

	public long getRating() {
		return rating;
	}

	public void setRating(long rating) {
		this.rating = rating;
	}

}
