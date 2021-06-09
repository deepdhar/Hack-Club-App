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
                new Members("Deep Dhar", "Leader", R.drawable.deep_dhar, "deep-dhar/", "deepdhar", "deepdhar2000"),
                new Members("Nivedita Prasad", "Co-Lead", R.drawable.nivi_sample, "nivedita-prasad-706719194/", "Nivedita-coder", "NiveditaPrasa15"),
                new Members("Alok Kumar Sah", "Co-Lead", R.drawable.alokx_sample, "alok-kumar-987b4b190/", "alokkumax", "alokkumax"),
                new Members("Debajit Mallick", "Core Team Member", R.drawable.debajit_mallick, "debajit-mallick/", "debajit13", "mallickdebajit"),
                new Members("Subhranil Sarkar", "Core Team Member", R.drawable.subhranil_sample, "subhranil-sarkar/", "", ""),
                new Members("Sayantani Deb", "Core Team Member", R.drawable.sayantani_deb, "sayantani-deb-035794200/", "SayantaniDeb", "SayantaniDeb2"),
                new Members("Soumwadeep Guha", "Core Team Member", R.drawable.soumwadeep_sample, "soumwadeep-guha-5b60031bb/", "soumwadeep", "soumwadeep"),
                new Members("Abhilasha Gupta", "Core Team Member", R.drawable.abhilasha_gupta, "abhilasha-gupta-829ba7190/", "AbhilashaGupta16", "Abhilasha_4sq"),
                new Members("Aditya Singh", "Core Team Member", R.drawable.aditya_singh, "aditya-singh-257852194/", "", "ask2addi"),
                new Members("Sayantani Sarkar", "Core Team Member", R.drawable.sayantani_sarkar, "sayantani-sarkar-026199200/", "sayantani9841", "Sayanta79969281")
        };

        MembersAdapter adapter = new MembersAdapter(members, getContext());
        recyclerView.setAdapter(adapter);

        return v;
    }
}
