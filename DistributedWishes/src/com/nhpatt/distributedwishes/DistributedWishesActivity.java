package com.nhpatt.distributedwishes;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DistributedWishesActivity extends Activity {
	private static final String TAG = "DISTRIBUTED_WISHES";

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.e(TAG, "Actividad creada");

		Button button = (Button) findViewById(R.id.saveWish);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View v) {
				Log.e(TAG, "Butón pulsado");
			}
		});
	}
}