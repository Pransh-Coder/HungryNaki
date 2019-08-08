package com.example.hungrynaki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ChineseAdapter  extends ArrayAdapter<String> {

    Context context;
    String names[];
    int images[];

    public ChineseAdapter(Context context, String[] names, int[] images) {
        super(context, R.layout.chinese_items,names);
        this.context = context;
        this.names = names;
        this.images = images;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.chinese_items,null);
        TextView textView = (TextView)view.findViewById(R.id.chinese);
        ImageView imageView =(ImageView)view.findViewById(R.id.cart1);

        textView.setText(names[position]);
        imageView.setImageResource(images[position]);

        return view;
    }

    public View getDropDownView(int position, View convertView,  ViewGroup parent) {

            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view =layoutInflater.inflate(R.layout.chinese_items,null);
            TextView textView = (TextView)view.findViewById(R.id.chinese);
            ImageView imageView =(ImageView)view.findViewById(R.id.cart1);

            textView.setText(names[position]);
            imageView.setImageResource(images[position]);

        return view;
    }
}
