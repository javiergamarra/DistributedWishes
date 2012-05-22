package com.nhpatt.distributedwishes;

public class Wish {

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
