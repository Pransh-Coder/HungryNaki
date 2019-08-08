package com.example.hungrynaki;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<FoodItem> {
Context context;
    public FoodAdapter(Context context, ArrayList<FoodItem> foodList)
    {
        super(context,0,foodList);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        return InitView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView,  ViewGroup parent) {
        return InitView(position, convertView, parent);
    }

    //Since we have to show same view in spinner view and dropdown view we will create another method which will return a view for these methods here

    private View InitView(int position,View convertView,ViewGroup parent)           //convertView is view which we have to recycle
    {
        if(convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.biriyani_items,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.cart);
        TextView textView = convertView.findViewById(R.id.curryitems);

        FoodItem foodItem = getItem(position);

        if (foodItem!=null)
        {
            imageView.setImageResource(foodItem.getCartImage());
            textView.setText(foodItem.getFoodItemName());
        }

     /*   FoodItem foodItem1=getItem(position);


        String val =foodItem1.getFoodItemName();


            Intent intent = new Intent(getContext(),DealsActivity.class);
            context.startActivity(intent);*/

        return convertView;
    }

}
