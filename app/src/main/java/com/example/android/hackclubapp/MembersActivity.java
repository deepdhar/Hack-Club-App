package com.example.android.hackclubapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.android.hackclubapp.Adapter.MembersAdapter;

import java.util.ArrayList;

public class MembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        getSupportActionBar().hide();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.membersRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Members[] members = new Members[] {
                //add members here
                new Members("Deep Dhar", "Leader", R.drawable.sample_image, "deep-dhar/", "deepdhar", "deepdhar2000"),
                new Members("Nivedita Prasad", "Co-Lead", R.drawable.nivi_sample, "nivedita-prasad-706719194/", "Nivedita-coder", "NiveditaPrasa15"),
                new Members("Alok Kumar Sah", "Co-Lead", R.drawable.alokx_sample, "alok-kumar-987b4b190/", "alokkumax", "alokkumax"),
        };

        MembersAdapter adapter = new MembersAdapter(members, MembersActivity.this);
        recyclerView.setAdapter(adapter);
    }
}