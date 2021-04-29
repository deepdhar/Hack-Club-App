package com.example.android.hackclubapp.Adapter;

import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.hackclubapp.MainActivity;
import com.example.android.hackclubapp.Members;
import com.example.android.hackclubapp.MembersActivity;
import com.example.android.hackclubapp.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MembersAdapter extends RecyclerView.Adapter<MembersAdapter.ViewHolder> {

    Members[] members;
    Context context;

    public MembersAdapter(Members[] members, MembersActivity activity) {
        this.members = members;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.members_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Members membersList = members[position];
        holder.textViewName.setText(membersList.getName());
        holder.textViewDesc.setText(membersList.getDesc());
        holder.memberImage.setImageResource(membersList.getImageResourceId());

        //opens LinkedIn
        holder.linkedinImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = membersList.getLinkedInUrl();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(i);
                Toast.makeText(context, "LinkedIn", Toast.LENGTH_SHORT).show();
            }
        });

        //opens GitHub
        holder.githubImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/" + membersList.getGithubUsername();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(i);
                Toast.makeText(context, "GitHub", Toast.LENGTH_SHORT).show();
            }
        });

        //opens Twitter
        holder.twitterImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://twitter.com/" + membersList.getTwitterUsername();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(i);
                Toast.makeText(context, "Twitter", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return members.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView memberImage;
        TextView textViewName;
        TextView textViewDesc;
        ImageView linkedinImage;
        ImageView githubImage;
        ImageView twitterImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            memberImage = itemView.findViewById(R.id.memberDpImageView);
            textViewName = itemView.findViewById(R.id.memberNameTextView);
            textViewDesc = itemView.findViewById(R.id.memberDescTextView);
            linkedinImage = itemView.findViewById(R.id.linkedinImageview);
            githubImage = itemView.findViewById(R.id.githubImageview);
            twitterImage = itemView.findViewById(R.id.twitterImageview);
        }
    }
}