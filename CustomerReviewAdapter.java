package com.example.hungrynaki;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerReviewAdapter extends RecyclerView.Adapter<CustomerReviewAdapter.ViewHolder> {

    //vars
    ArrayList<String> Names;
    ArrayList<String> Reviews;
    //private Context context;
    //View view1;

    public CustomerReviewAdapter(ArrayList<String> Names, ArrayList<String> Reviews) {      // Context context
        this.Names = Names;
        this.Reviews = Reviews;
        //this.context = context;
    }

    @NonNull
    @Override
    public CustomerReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view1= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item,parent,false);         // This will going to inflate each individual layout
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.names.setText(Names.get(position));
        viewHolder.reviews.setText(Reviews.get(position));
    }


    @Override
    public int getItemCount() {
        return Names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView names;
        TextView reviews;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            names=itemView.findViewById(R.id.textView7);
            reviews=itemView.findViewById(R.id.textView8);
        }
    }
}
