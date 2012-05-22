package com.nhpatt.distributedwishes.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.nhpatt.distributedwishes.R;
import com.nhpatt.distributedwishes.model.Wish;

public class WishAdapter extends ArrayAdapter<Wish> {

	public WishAdapter(final Context context, final int resource,
			final List<Wish> objects) {
		super(context, resource, objects);
	}

	@Override
	public View getView(final int position, View convertView,
			final ViewGroup parent) {
		if (convertView == null) {
			final LayoutInflater vi = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = vi.inflate(R.layout.fila, null);
		}

		setValuesFromWishInRow(getItem(position), convertView);

		return convertView;
	}

	private void setValuesFromWishInRow(final Wish wish, final View convertView) {
		final TextView fecha = (TextView) convertView
				.findViewById(R.id.bottomText);
		fecha.setText(wish.getRating().toString());
		final TextView textoNota = (TextView) convertView
				.findViewById(R.id.topText);
		textoNota.setText(wish.getWish());
	}
}
