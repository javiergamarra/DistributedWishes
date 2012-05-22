package com.nhpatt.distributedwishes.model;

import java.io.Serializable;

public class Wish implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer rating;
	private String wish;

	public Wish(final String wish, final int rating) {
		this.wish = wish;
		this.rating = rating;
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
