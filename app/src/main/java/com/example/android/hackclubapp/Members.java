package com.example.android.hackclubapp;

public class Members {

    private String mName;
    private String mDesc;
    private int mImageResourceId;
    private String mLinkedInUrl;
    private String mGithubUsername;
    private String mTwitterUsername;

    public Members(String name, String desc, int imageResourceId, String linkedInUrl, String githubUsername,
                   String twitterUsername) {
        mName = name;
        mDesc = desc;
        mImageResourceId = imageResourceId;
        mLinkedInUrl = linkedInUrl;
        mGithubUsername = githubUsername;
        mTwitterUsername = twitterUsername;
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


    public String getGithubUsername() { return mGithubUsername; }

    public void setmGithubUsername(String githubUsername) { mGithubUsername = githubUsername; }


    public String getTwitterUsername() { return mTwitterUsername; }

    public void setTwitterUsername(String twitterUsername) { mTwitterUsername = twitterUsername; }

}
