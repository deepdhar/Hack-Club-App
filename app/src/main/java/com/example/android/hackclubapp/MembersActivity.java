package com.example.android.hackclubapp;

import androidx.appcompat.app.AppCompatActivity;
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

        ArrayList<Members> members = new ArrayList<Members>();

        // add members here
        members.add(new Members("Deep Dhar", "Leader", R.drawable.sample_image));
        members.add(new Members("Nivedita Prasad", "Co-Lead", R.drawable.nivi_sample));
        members.add(new Members("Alok Kumar Sah", "Co-Lead", R.drawable.alokx_sample));

        MembersAdapter adapter = new MembersAdapter(MembersActivity.this, members);
        ListView listView = (ListView) findViewById(R.id.membersListView);
        listView.setAdapter(adapter);
    }
}