package com.nhpatt.distributedwishes.activity;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
	}

	public Integer getId() {
		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(this);

		SharedPreferences.Editor editor = preferences.edit();
		int id = preferences.getInt("id", 0) + 1;
		editor.putInt("id", id);
		editor.commit();
		return id;
	}
}
