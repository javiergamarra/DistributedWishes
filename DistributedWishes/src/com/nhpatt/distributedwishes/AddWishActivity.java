package com.nhpatt.distributedwishes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddWishActivity extends Activity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addwish);

		Button button = (Button) findViewById(R.id.saveWish);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View v) {
				EditText wishField = (EditText) findViewById(R.id.wish);
				String wish = wishField.getText().toString();
			}
		});
	}

}
