package com.example.a4pr_mobile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Item> {
    private final LayoutInflater
            inflater;
    private final int layout;
    private final List<Item> items;

    public ListViewAdapter(Context context, int resource,
                           List<Item> items) {
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        @SuppressLint("ViewHolder") View view = inflater.inflate(this.layout, parent, false);
        TextView textView = view.findViewById(R.id.itemTextView);
        Item item = items.get(position);
        textView.setText(item.getText());
        ImageView imageView = view.findViewById(R.id.itemImageView);
        imageView.setImageResource(item.getImage());
        return view;
    }
}
