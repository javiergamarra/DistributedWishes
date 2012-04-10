package com.nhpatt.distributedwishes;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DistributedWishesActivity extends Activity {
	private static final String TAG = "DISTRIBUTED_WISHES";

	private final List<String> wishes = new ArrayList<String>();

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.e(TAG, "Activity created");

		Button button = (Button) findViewById(R.id.saveWish);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View v) {
				EditText wishField = (EditText) findViewById(R.id.wish);
				String wish = wishField.getText().toString();
				wishes.add(wish);
				Log.e(TAG, "Added wish: " + wish);
			}
		});
	}
}