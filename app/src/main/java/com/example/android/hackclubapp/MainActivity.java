package com.example.android.hackclubapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.android.hackclubapp.Adapter.VideosAdapter;

public class MainActivity extends AppCompatActivity {

    Button button1;
    ScrollView myScrollView;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

//        myScrollView = findViewById(R.id.homepageScrollview);
//        //hiding scrollbar
//        myScrollView.setVerticalScrollBarEnabled(false);
//        myScrollView.setHorizontalScrollBarEnabled(false);

        recyclerView = findViewById(R.id.homeRecyclerview);
        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setNestedScrollingEnabled(false);

        button1 = (Button) findViewById(R.id.homeButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Our Members", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, MembersActivity.class));
            }
        });

        Videos videos[] = new Videos[] {
                new Videos("Intro to Engineering", R.drawable.intro_to_engg, "https://www.youtube.com/watch?v=qjctMXhyQNk&t=433s"),
                new Videos("Cracking Placement Interviews", R.drawable.placement_interview, "https://www.youtube.com/watch?v=E3kYpg2mEok&t=591s"),
                new Videos("Python Bootcamp", R.drawable.python_bootcamp, "https://www.youtube.com/watch?v=qHVrIB-Ncc0&list=PLyROu-LDySYNaJjHKqMgJ5rLVZ2e0jg7S"),
                new Videos("Watch More", R.drawable.watch_more, "https://www.youtube.com/channel/UCUNKlsGUtcwAclmyatjo1ow/featured"),
        };

        VideosAdapter adapter = new VideosAdapter(videos, MainActivity.this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager1);

    }
}