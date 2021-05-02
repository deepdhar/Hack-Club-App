package com.example.android.hackclubapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.hackclubapp.Adapter.VideosAdapter;

public class HomeFragment extends Fragment {

    ScrollView myScrollView;
    RecyclerView recyclerView;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_home, container, false);

        myScrollView = v.findViewById(R.id.homepageNestedScrollview);
        //hiding scrollbar
        myScrollView.setVerticalScrollBarEnabled(false);
        myScrollView.setHorizontalScrollBarEnabled(false);

        recyclerView = v.findViewById(R.id.homeRecyclerview);
        recyclerView.setHasFixedSize(true);

        Videos videos[] = new Videos[] {
                new Videos("Intro to Engineering", R.drawable.intro_to_engg, "https://www.youtube.com/watch?v=qjctMXhyQNk&t=433s"),
                new Videos("Cracking Placement Interviews", R.drawable.placement_interview, "https://www.youtube.com/watch?v=E3kYpg2mEok&t=591s"),
                new Videos("Python Bootcamp", R.drawable.python_bootcamp, "https://www.youtube.com/watch?v=qHVrIB-Ncc0&list=PLyROu-LDySYNaJjHKqMgJ5rLVZ2e0jg7S"),
                new Videos("Watch More", R.drawable.watch_more, "https://www.youtube.com/channel/UCUNKlsGUtcwAclmyatjo1ow/featured"),
        };

        VideosAdapter adapter = new VideosAdapter(videos, getContext());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager1 = new LinearLayoutManager(getContext());
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager1);

        return v;
    }
}
