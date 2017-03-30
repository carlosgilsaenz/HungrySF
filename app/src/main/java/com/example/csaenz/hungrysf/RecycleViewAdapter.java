package com.example.csaenz.hungrysf;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by csaenz on 3/29/2017.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    // Store a member variable for the contacts
    private ArrayList<Restaurant> mRestaurantsList;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public RecycleViewAdapter(Context context, ArrayList<Restaurant> restaurantsList) {
        mRestaurantsList = restaurantsList;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate custom Layout
        View restaurantView = inflater.inflate(R.layout.list_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(restaurantView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get correct Restaurant from ArrayList
        Restaurant restaurant = mRestaurantsList.get(position);

        // Set item views based on your views and data model
        TextView name = holder.mRestaurantName;
        name.setText(restaurant.getRestaurantName());
        TextView location = holder.mRestaurantLocation;
        location.setText(restaurant.getRestaurantLocation());
        ImageView image = holder.mRestaurantImage;

        if (restaurant.hasImage()){
            image.setImageResource(restaurant.getImageResourceID());
            image.setVisibility(View.VISIBLE);
        } else{
            image.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mRestaurantsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.restaurantName)
        TextView mRestaurantName;
        @BindView(R.id.restaurantLocation)
        TextView mRestaurantLocation;
        @BindView(R.id.restaurantImage)
        ImageView mRestaurantImage;

        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}

