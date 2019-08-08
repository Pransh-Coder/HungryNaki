package com.example.hungrynaki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class Breakfast extends AppCompatActivity {

    /*private int lastExpandedPosition = -1;
    private ExpandableRelativeLayout lv;*/

    RelativeLayout relativeLayout;
    RelativeLayout rel;
    ExpandableRelativeLayout mycontent;

    RelativeLayout relativeLayout1;
    ExpandableRelativeLayout mycontent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        relativeLayout = findViewById(R.id.relative);
        rel = findViewById(R.id.relative);
        mycontent = (ExpandableRelativeLayout) findViewById(R.id.mycontent);

        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mycontent.toggle();
            }
        });

        relativeLayout1 = findViewById(R.id.relative1);
        mycontent1 = (ExpandableRelativeLayout) findViewById(R.id.mycontent);


        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mycontent1.toggle();
            }
        });



    }
}
