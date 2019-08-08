package com.example.hungrynaki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class Chinese extends AppCompatActivity {

    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    ChineseAdapter adapter;

    String names[]={"Select Item","Noodles","Hukka Noodles","Manchurian","Chilli Paneer","Chilli Chicken"};
    int images[]={R.drawable.noodles,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart};

    String newName[]={"Select Sichuan","Sichuan Hot Pot","Bon bon chicken","Dandan noodles","Mapo doufu","Chili Oil Wontons"};
    int newimages[]={R.drawable.sichuan,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart};

    String names1[]={"Shadong Cusine ","Stewed Pork Hock ","Four Joy Meatballs","Dezhou Grilled Chicken","Deep-fried golden"};
    int images1[]={R.drawable.shandong,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        spinner1 =findViewById(R.id.spinner2);
        adapter = new ChineseAdapter(this,names,images);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Intent intent = new Intent(Chinese.this,Indian.class);
                Toast.makeText(getApplicationContext(),names[position],Toast.LENGTH_SHORT).show();
                //startActivity(intent);

                //String value= names[position].id;
                if(names[position].equalsIgnoreCase("Noodles"))
                {
                    Intent intent = new Intent(Chinese.this,Noodles.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2 =findViewById(R.id.spinner3);
        adapter = new ChineseAdapter(this,newName,newimages);
        spinner2.setAdapter(adapter);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),newName[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3 =findViewById(R.id.spinner4);
        adapter = new ChineseAdapter(this,names1,images1);
        spinner3.setAdapter(adapter);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),names1[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
