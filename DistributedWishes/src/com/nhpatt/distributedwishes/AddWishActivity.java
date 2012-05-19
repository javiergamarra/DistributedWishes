package com.nhpatt.distributedwishes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
				Intent intent = new Intent();
				intent.putExtra("resultado", wish);
				setResult(RESULT_OK, intent);
				Toast.makeText(AddWishActivity.this, "Deseo a�adido!",
						Toast.LENGTH_LONG).show();
				finish();
			}
		});
	}
}
