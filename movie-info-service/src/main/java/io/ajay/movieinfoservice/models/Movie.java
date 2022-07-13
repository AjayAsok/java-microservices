/**
 * 
 */
package io.ajay.movieinfoservice.models;

/**
 * @author 40119273
 *
 */
public class Movie {
	public String movieId;
	public String desc;

	/**
	 * @param movieId
	 * @param desc
	 */
	public Movie(String movieId, String desc) {
		super();
		this.movieId = movieId;
		this.desc = desc;
	}

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
