package com.example.hungrynaki;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    //vars
    private ArrayList<String> mnames= new ArrayList<>();
    List<Data> horizontalList = Collections.emptyList();
    //private ArrayList<String> mImageUrls=new ArrayList<>();
    private Context mContext;

    /*private int images[];

    public  RecyclerAdapter(int images[])                                                           //constructor for adapter
    {
        this.images=images;                                                                         //initialize the array
    }

    private String data[];

    public RecyclerAdapter(String[] data)
    {
        this.data = data;
    }*/

    public RecyclerAdapter(Context context, ArrayList<String> mnames, List<Data> horizontalList) {               //constructor
        this.mnames = mnames;
        this.horizontalList = horizontalList;
        //this.mImageUrls = mImageUrls;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.album_layout,parent,false);         // This will going to inflate each individual layout
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        //Glide.with(mContext).asBitmap().load(mImageUrls.get(position)).into(holder.image);

        /*holder.name.setText(mnames.get(position));                                                   // to set different names for each tile like stacks o snacks
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mnames.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext,Fav_Foodie.class);
                mContext.startActivity(intent);
            }
        });
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d(TAG, "onClick:clicked on the image: " + mnames.get(position));
                Toast.makeText(mContext,mnames.get(position), Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(mContext,Fav_Foodie.class);
               mContext.startActivity(intent);
            }
        });*/
        holder.name.setText(horizontalList.get(position).txt );                                                   //horizontalList.get(position).txt  mnames.get(position)

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,horizontalList.get(position).txt, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext,Fav_Foodie.class);
                mContext.startActivity(intent);
            }
        });

        holder.image.setImageResource(horizontalList.get(position).imageId);    //android.widget.ImageView Sets a drawable as the content of this ImageView



        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value=horizontalList.get(position).txt;

                if(value.equalsIgnoreCase("Fav Foodie")){

                    Intent intent = new Intent(mContext,Fav_Foodie.class);
                    mContext.startActivity(intent);
                }else {
                    Toast.makeText(mContext,horizontalList.get(position).txt, Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        //return mnames.size();
        return horizontalList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.textView3);
            relativeLayout=itemView.findViewById(R.id.rel);
        }
    }

}
