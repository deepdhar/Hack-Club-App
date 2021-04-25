package com.example.android.hackclubapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android.hackclubapp.Members;
import com.example.android.hackclubapp.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MembersAdapter extends ArrayAdapter<Members> {

    public MembersAdapter(Context context, ArrayList<Members> members) {
        super(context, 0, members);
    }

    @Override
    public View getView(int position, View counterView, ViewGroup parent) {
        View membersLayoutView = counterView;
        if(membersLayoutView == null){
            membersLayoutView = LayoutInflater.from(getContext()).inflate(R.layout.members_layout, parent, false);
        }

        Members currentMember = getItem(position);

        ImageView dpImageView = (ImageView) membersLayoutView.findViewById(R.id.memberDpImageView);
        dpImageView.setImageResource(currentMember.getImageResourceId());

        TextView nameTextView = (TextView) membersLayoutView.findViewById(R.id.memberNameTextView);
        nameTextView.setText(currentMember.getName());

        TextView descTextView = (TextView) membersLayoutView.findViewById(R.id.memberDescTextView);
        descTextView.setText(currentMember.getDesc());

        return membersLayoutView;
    }
}
