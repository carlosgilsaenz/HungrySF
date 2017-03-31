package com.example.csaenz.hungrysf;

/**
 * Created by csaenz on 3/29/2017.
 */

public class Restaurant {
    private static final int NO_IMAGE = -1;

    private String mRestaurantName;

    private String mRestaurantLocation;

    private int mImageResourceID = NO_IMAGE;

    /**
     * All Constructors
     * First takes no Image
     */
    Restaurant(String restaurant, String location) {
        mRestaurantName = restaurant;
        mRestaurantLocation = location;
    }

    Restaurant(String restaurant, String location, int drawable) {
        mRestaurantName = restaurant;
        mRestaurantLocation = location;
        mImageResourceID = drawable;
    }

    /**
     * All Setters for each variable
     */
    public void setRestaurantName(String mRestaurantName) {
        this.mRestaurantName = mRestaurantName;
    }

    public void setRestaurantLocation(String mRestaurantLocation) {
        this.mRestaurantLocation = mRestaurantLocation;
    }

    public void setmImageResourceID(int mImageResourceID) {
        this.mImageResourceID = mImageResourceID;
    }

    /**
     * All Getters for each variable, but static values
     */
    public String getRestaurantName() {
        return mRestaurantName;
    }

    public String getRestaurantLocation() {
        return mRestaurantLocation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Ensures Image is valid
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE;
    }
}
