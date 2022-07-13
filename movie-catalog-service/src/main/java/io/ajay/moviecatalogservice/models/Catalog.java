package io.ajay.moviecatalogservice.models;

public class Catalog {

	public String name;
	public String desc;
	public long rating;

	public Catalog() {
	}

	public Catalog(String name, String desc, long rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the rating
	 */
	public long getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(long rating) {
		this.rating = rating;
	}

}
