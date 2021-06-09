package com.example.android.hackclubapp;

public class Videos {

    private String mVideoDesc;
    private int mVideoImageResourceId;
    private String mVideoUrl;

    public Videos(String videoDesc, int videoImageResourceId, String videoUrl) {
        mVideoDesc = videoDesc;
        mVideoImageResourceId = videoImageResourceId;
        mVideoUrl = videoUrl;
    }

    public String getVideoDesc() {
        return mVideoDesc;
    }

    public void setmVideoDesc(String videoDesc) {
       mVideoDesc = videoDesc;
    }


    public int getVideoImageResourceId() {
        return mVideoImageResourceId;
    }

    public void setmVideoImageResourceId(int videoImageResourceId) {
        mVideoImageResourceId = videoImageResourceId;
    }


    public String getVideoUrl() {
        return mVideoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        mVideoUrl = videoUrl;
    }
}
