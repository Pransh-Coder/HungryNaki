package com.example.hungrynaki;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;


public class CustomerReview extends Fragment {

    private Menu.OnFragmentInteractionListener mListener;

    //ArrayList<String> Names;
    //ArrayList<String> Reviews;

    private List<Customer> customer;

    RecyclerView recyclerview;
    RecyclerView.LayoutManager layoutManager;
    CustomerReviewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_customer_review, container, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        /*customer = new ArrayList<>();
        customer.add(new Customer("Raghav Raghuvanshi", "Nice App!"));
        customer.add(new Customer("Shatul Rastogi", "Awesome App!"));
        customer.add(new Customer("Anant Mishra", "Cool App!"));
        customer.add(new Customer("Anuradha Baijal", "Waste of time app!"));*/


        // AddItemsToRecyclerViewArrayList();
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new CustomerReviewAdapter(getContext(), customer); //,CustomerReview.this);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customer = new ArrayList<>();
        customer.add(new Customer("Raghav Raghuvanshi", "Nice App!"));
        customer.add(new Customer("Shatul Rastogi", "Awesome App!"));
        customer.add(new Customer("Anant Mishra", "Cool App!"));
        customer.add(new Customer("Anuradha Baijal", "Waste of time app!"));


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Menu.OnFragmentInteractionListener) {
            mListener = (Menu.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}


