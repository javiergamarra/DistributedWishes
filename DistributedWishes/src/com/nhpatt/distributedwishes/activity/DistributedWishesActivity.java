package com.nhpatt.distributedwishes.activity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.nhpatt.distributedwishes.R;
import com.nhpatt.distributedwishes.adapter.WishAdapter;
import com.nhpatt.distributedwishes.model.Wish;

public class DistributedWishesActivity extends ListActivity {
	private final List<Wish> wishes = new ArrayList<Wish>();
	private WishAdapter adapter;
	private static final int INCLUIR_NOTA = 0;

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		adapter = new WishAdapter(this, android.R.layout.simple_list_item_1,
				wishes);
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
				Random random = new Random(Calendar.getInstance()
						.getTimeInMillis());
				Integer id = ((MyApplication) getApplication()).getId();
				wishes.add(new Wish(id, data.getExtras().getString("result"),
						random.nextInt(11)));
				adapter.notifyDataSetChanged();
			}
			break;

		default:
			break;
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
}