package com.nhpatt.distributedwishes.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
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

		loadWishes(wishes);
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
				Integer id = ((MyApplication) getApplication()).getId();
				Wish wish = new Wish(id, data.getExtras().getString("result"));
				wishes.add(wish);
				saveWish(wish);
				adapter.notifyDataSetChanged();
			}
			break;

		default:
			break;
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	private void saveWish(final Wish wish) {
		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(getApplicationContext());
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(wish.getId().toString(), wish.getWish());
		editor.commit();
	}

	private void loadWishes(final List<Wish> wishes) {
		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(getApplicationContext());
		Integer id = preferences.getInt("id", 0);
		for (int i = 0; i <= id; i++) {
			if (preferences.contains(String.valueOf(i))) {
				wishes.add(new Wish(i, preferences.getString(String.valueOf(i),
						"")));
			}

		}
	}
}