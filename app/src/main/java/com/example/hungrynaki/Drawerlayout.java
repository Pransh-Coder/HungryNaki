package com.example.hungrynaki;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Drawerlayout extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawerlayout);

        mDrawerlayout=(DrawerLayout)findViewById(R.id.drawer);

        NavigationView navigationView=findViewById(R.id.navigationId);

        navigationView.setNavigationItemSelectedListener(this);
        mToggle=new ActionBarDrawerToggle(this,mDrawerlayout,R.string.open,R.string.close);         //created toggle bar or icon

        mDrawerlayout.addDrawerListener(mToggle);                                                           // we have to add icon to drawable

        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);                                              //Display the icon
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {                   // without this icon will not work which is at the left of screen

        if(mToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Intent intent,intent1;

        if(item.getItemId()==R.id.loc)
        {
            intent = new Intent(this,LocationActivity.class);
            startActivity(intent);
            //Toast.makeText(Drawerlayout.this,"CHECK",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.deals)
        {
            intent1 = new Intent(this,DealsActivity.class);
            startActivity(intent1);
        }
        return false;
    }
}
