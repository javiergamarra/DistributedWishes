package com.nhpatt.distributedwishes;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DistributedWishesActivity extends Activity {
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.e("DISTRIBUTED_WISHES", "Actividad creada");
	}
}