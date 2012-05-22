package com.nhpatt.distributedwishes.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nhpatt.distributedwishes.R;

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

				Intent intent = new Intent();
				intent.putExtra("result", wishField.getText().toString());

				setResult(RESULT_OK, intent);
				Toast.makeText(AddWishActivity.this,
						getString(R.string.wishAdded), Toast.LENGTH_LONG)
						.show();
				finish();
			}
		});
	}
}
