package com.example.hungrynaki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Indian extends AppCompatActivity {
    private ArrayList<FoodItem> foodList;
    private FoodAdapter adapter;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
        initList();

        spinner =findViewById(R.id.spinner);

        adapter = new FoodAdapter(this,foodList);
        spinner.setAdapter(adapter);
        /*spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



                String selectedItem = parent.getItemAtPosition(position).toString();
                System.out.println(selectedItem);
                Toast.makeText(Indian.this,selectedItem.toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
    }

    private void initList() {
        foodList=new ArrayList<>();
        foodList.add(new FoodItem("Select Item ",R.drawable.curry));
        foodList.add(new FoodItem("Chicken Masala "+"  Rs.200",R.drawable.cart));
        foodList.add(new FoodItem("Chicken Malikari"+"  Rs.250",R.drawable.cart));
        foodList.add(new FoodItem("Prawn Masala"+"      Rs.200",R.drawable.cart));
        foodList.add(new FoodItem("Prawn Malikari"+"     Rs.260",R.drawable.cart));
        foodList.add(new FoodItem("Beef Bhurji"+"            Rs.220",R.drawable.cart));


    }
}
