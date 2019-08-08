package com.example.hungrynaki;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CustomerReview extends Fragment {

    private Menu.OnFragmentInteractionListener mListener;

    ArrayList<String> Names;
    ArrayList<String> Reviews;
    private RecyclerView recyclerview;
    private RecyclerView.LayoutManager layoutManager;
    private CustomerReviewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {// Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_customer_review, container, false);
        recyclerview = (RecyclerView)view.findViewById(R.id.recyclerview);
        AddItemsToRecyclerViewArrayList();
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new CustomerReviewAdapter(Names,Reviews); //,CustomerReview.this);
        return view;
    }

    public void AddItemsToRecyclerViewArrayList() {
        Names=new ArrayList<>();
        Reviews=new ArrayList<>();

        Names.add("Raghav Raguvanshi");
        Reviews.add("Lorem Ipsum is simply dummy text");

        Names.add("Ajay Rastogi");
        Reviews.add("Lorem Ipsum is simply dummy text");

        Names.add("Rajkumar Yadav");
        Reviews.add("Lorem Ipsum is simply dummy text");
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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
