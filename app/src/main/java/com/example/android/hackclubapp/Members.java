package com.example.android.hackclubapp;

public class Members {

    private String mName;
    private String mDesc;
    private int mImageResourceId;
    private String mLinkedInUrl;

    public Members(String name, String desc, int imageResourceId, String linkedInUrl) {
        mName = name;
        mDesc = desc;
        mImageResourceId = imageResourceId;
        mLinkedInUrl = linkedInUrl;
    }

    public String getName() { return mName; }

    public void setName(String name) {
        mName = name;
    }

    public String getDesc() { return mDesc; }

    public void setDesc(String desc) { mDesc = desc;}

    public int getImageResourceId() {return mImageResourceId; }

    public void setImageResourceId(int imageResourceId) { mImageResourceId = imageResourceId; }

    public String getLinkedInUrl() { return mLinkedInUrl; }

    public void setLinkedInUrl(String linkedInUrl) { mLinkedInUrl = linkedInUrl; }

}
