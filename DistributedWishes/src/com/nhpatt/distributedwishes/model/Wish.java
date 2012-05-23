package com.nhpatt.distributedwishes.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;

public class Wish implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer rating;
	private String wish;

	public Wish(final Integer id, final String wish) {
		this.id = id;
		this.wish = wish;
		Random random = new Random(Calendar.getInstance().getTimeInMillis());
		this.rating = random.nextInt(11);
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
