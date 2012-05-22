package com.nhpatt.distributedwishes.model;

import java.io.Serializable;

public class Wish implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer rating;
	private String wish;

	public Wish(final Integer id, final String wish, final int rating) {
		this.id = id;
		this.wish = wish;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(final Integer rating) {
		this.rating = rating;
	}

	public String getWish() {
		return wish;
	}

	public void setWish(final String wish) {
		this.wish = wish;
	}

}
