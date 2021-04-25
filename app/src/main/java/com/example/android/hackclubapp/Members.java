package com.example.android.hackclubapp;

public class Members {

    private String mName;
    private String mDesc;
    private int mImageResourceId;

    public Members(String name, String desc, int imageResourceId) {
        mName = name;
        mDesc = desc;
        mImageResourceId = imageResourceId;
    }

    public String getName() { return mName; }

    public String getDesc() { return mDesc; }

    public int getImageResourceId() {return mImageResourceId; }

}
