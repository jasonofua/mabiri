package com.example.root.mabiri.Activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;

import com.example.root.mabiri.Adapters.NearYouItem;
import com.example.root.mabiri.Models.NearYouItems;
import com.example.root.mabiri.R;
import com.example.root.mabiri.databinding.ActivityHomeBinding;

import java.util.ArrayList;

public class Home extends AppCompatActivity implements SearchView.OnQueryTextListener {
    // using databinding to bind the views from the layout
    private ActivityHomeBinding homeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        // setting the toolbar to show the logo and text and nav icon
        homeBinding.toolbar.setTitle("");
        setSupportActionBar(homeBinding.toolbar);
        initViews();

        homeBinding.imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaySearchView();

            }
        });
    }

    private void initViews() {
        homeBinding.nearYouRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        homeBinding.nearYouRecyclerView.setLayoutManager(layoutManager);
        ArrayList<NearYouItems> nearYouItemsArrayList = showItems();
        NearYouItem adapter = new NearYouItem(showItems(),Home.this);
        homeBinding.nearYouRecyclerView.setAdapter(adapter);
    }

    private ArrayList<NearYouItems> showItems() {
        ArrayList<NearYouItems> nearYouItemsArrayList = new ArrayList<>();
        NearYouItems items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);
        items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);
        items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);
        items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);
        items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);
        items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);
        items = new NearYouItems("Poflo Body Spray","Oges Supermarket","N230","1 min walk from you",R.drawable.ic_cloud_black_24dp);
        nearYouItemsArrayList.add(items);

        return nearYouItemsArrayList;
    }

    private void displaySearchView()
    {
        // setting up the search view
        homeBinding.search.setActivated(true);
        homeBinding.search.setVisibility(View.VISIBLE);
        homeBinding.search.setOnQueryTextListener(this);
        homeBinding.search.setQueryHint("Type your keyword here");
        homeBinding.search.onActionViewExpanded();
        homeBinding.search.setIconified(false);
        homeBinding.search.clearFocus();

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    @Override
    public void onBackPressed() {
        // closing the search view on back pressed
        if (!homeBinding.search.isIconified()) {
            homeBinding.search.setIconified(true);
            homeBinding.search.setVisibility(View.GONE);
        } else {
            super.onBackPressed();
        }
    }
}
