package com.example.hungrynaki;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomerReviewAdapter extends RecyclerView.Adapter<CustomerReviewAdapter.ViewHolder> {

    //vars
    /*ArrayList<String> Names;
    ArrayList<String> Reviews;*/
    private Context context;
    List<Customer>mData;
    //View view1;


    public CustomerReviewAdapter(Context context, List<Customer> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CustomerReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view1= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item,parent,false);         // This will going to inflate each individual layout
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.names.setText(mData.get(position).getName());
        viewHolder.reviews.setText(mData.get(position).getReview());
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView names;
        TextView reviews;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            names=itemView.findViewById(R.id.name);
            reviews=itemView.findViewById(R.id.review);
        }
    }
}
