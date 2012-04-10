package com.nhpatt.distributedwishes;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;

public class DistributedWishesActivity extends ListActivity {
	private static final String TAG = "DISTRIBUTED_WISHES";

	private final List<String> wishes = new ArrayList<String>();
	private ArrayAdapter<String> adapter;

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, wishes);
		setListAdapter(adapter);

		Button button = (Button) findViewById(R.id.saveWish);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View v) {
				EditText wishField = (EditText) findViewById(R.id.wish);
				String wish = wishField.getText().toString();
				wishes.add(wish);
				adapter.notifyDataSetChanged();
			}
		});
	}
}