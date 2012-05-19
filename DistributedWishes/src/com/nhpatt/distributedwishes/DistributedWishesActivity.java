package com.nhpatt.distributedwishes;

import java.util.ArrayList;
import java.util.List;

import android.R.array;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class DistributedWishesActivity extends ListActivity {
	private static final String TAG = "DISTRIBUTED_WISHES";

	private final List<String> wishes = new ArrayList<String>();
	private ArrayAdapter<String> adapter;
	private static final int INCLUIR_NOTA = 0;

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, wishes);
		setListAdapter(adapter);

		Button wishAddField = (Button) findViewById(R.id.addWish);
		wishAddField.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View paramView) {
				Intent intent = new Intent(DistributedWishesActivity.this,
						AddWishActivity.class);
				startActivityForResult(intent, INCLUIR_NOTA);
			}
		});
	}

	@Override
	protected void onActivityResult(final int requestCode,
			final int resultCode, final Intent data) {
		switch (requestCode) {
		case INCLUIR_NOTA:
			if (resultCode == RESULT_OK) {
				wishes.add(data.getExtras().getString("resultado"));
				adapter.notifyDataSetChanged();
			}
			break;

		default:
			break;
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
}