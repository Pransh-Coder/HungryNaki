package com.example.hungrynaki;

import android.provider.ContactsContract;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Fourth_page extends AppCompatActivity  {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ActionBar actionBar;

    //private int images[]={R.drawable.stacksosnacks,R.drawable.favfoodie,R.drawable.chickchiken};
    //String titles[]={"Snack o' Snack","Fav Foodie","Chick Chicken"};

    private ArrayList<String> mnames = new ArrayList<>();
    //private ArrayList<String> mImageUrls = new ArrayList<>();
    private List<Data> data;

    //private List<Data> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);

        data = fill_with_data();            //funct call

        actionBar=getSupportActionBar();
        actionBar.setTitle("Zomato");

        //getImages();                    //calling funct

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(Fourth_page.this,mnames,data); //initialise the adapter
        recyclerView.setAdapter(adapter);
    }

    public List<Data> fill_with_data() {
        List<Data> data = new ArrayList<>();

        data.add(new Data( R.drawable.img1, "Rajshahi"));
        data.add(new Data( R.drawable.img2, "LalBagh"));
        data.add(new Data( R.drawable.img3, "Fav Foodie"));
        data.add(new Data( R.drawable.img4, "Santoor Dinning"));
        data.add(new Data( R.drawable.img9, "Red Carboose"));
        data.add(new Data( R.drawable.img5, "Grand PrincE"));
        data.add(new Data( R.drawable.img6, "Lotus"));
        data.add(new Data( R.drawable.img7, "White Spot"));
        data.add(new Data( R.drawable.img8, "La Gracia"));

        return data;
    }

    /*private void getImages() {

        mImageUrls.add("https://s3.amazonaws.com/cms.ipressroom.com/285/files/20188/5baa3a902cfac254c46dd67c_14_CupShow_NoLocal/14_CupShow_NoLocal_thmb.jpg");
        mnames.add("Dnkn' Donuts");

        mImageUrls.add("http://www.logotypes101.com/logos/244/0C7D2C4E0210ED5C47D3AB0AC97033D4/kfc_new_logo.png");
        mnames.add("KFC");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgHgkCDgoaut4min45MDYeqd-CaaZFrGtJsJIjS9iNngTnFtmA");
        mnames.add("Chick Chicken");

        mImageUrls.add("https://wl3-cdn.landsec.com/sites/default/files/styles/shop_logo/public/images/shops/logos/choice.png?itok=BEEMLVJF");
        mnames.add("Radhuni Resturant");


        mImageUrls.add("https://wl3-cdn.landsec.com/sites/default/files/styles/shop_logo/public/images/shops/logos/burger-king_0.png?itok=CCEzaCmu");
        mnames.add("Burger King");

        mImageUrls.add("http://www.santoor.com.bd/wp-content/uploads/2017/06/santoor-logo-1.png");
        mnames.add("Santoor Dinning");

        mImageUrls.add("https://wl3-cdn.landsec.com/sites/default/files/styles/shop_logo/public/images/shops/logos/bissys-pretzels_1.png?itok=TCeMSImx");
        mnames.add("Bissys");

        mImageUrls.add("http://zaytunarestaurant.com/wp-content/uploads/2016/08/logo_final_halalAdded.png");
        mnames.add("ZAYTUNA ");

        mImageUrls.add("https://pbs.twimg.com/profile_images/898185703598694400/Aw9mK_L4.jpg");
        mnames.add("Palm Resturant");
    }*/
}
