package com.nhpatt.distributedwishes.activity;

import android.app.Application;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
	}

	private Integer id = 0;

	public Integer getId() {
		return id++;
	}

}
