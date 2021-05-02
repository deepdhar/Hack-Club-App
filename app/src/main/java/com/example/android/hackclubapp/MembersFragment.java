package com.example.android.hackclubapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.hackclubapp.Adapter.MembersAdapter;

public class MembersFragment extends Fragment {

    RecyclerView recyclerView;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_members, container, false);

        recyclerView = v.findViewById(R.id.membersRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Members[] members = new Members[] {
                //add members here
                new Members("Deep Dhar", "Leader", R.drawable.sample_image, "deep-dhar/", "deepdhar", "deepdhar2000"),
                new Members("Nivedita Prasad", "Co-Lead", R.drawable.nivi_sample, "nivedita-prasad-706719194/", "Nivedita-coder", "NiveditaPrasa15"),
                new Members("Alok Kumar Sah", "Co-Lead", R.drawable.alokx_sample, "alok-kumar-987b4b190/", "alokkumax", "alokkumax"),
                new Members("Soumwadeep Guha", "Core Team Member", R.drawable.soumwadeep_sample, "soumwadeep-guha-5b60031bb/", "soumwadeep", "soumwadeep"),
        };

        MembersAdapter adapter = new MembersAdapter(members, getContext());
        recyclerView.setAdapter(adapter);

        return v;
    }
}
