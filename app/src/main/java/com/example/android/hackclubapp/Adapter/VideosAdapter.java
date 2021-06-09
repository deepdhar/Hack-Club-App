package com.example.android.hackclubapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.hackclubapp.HomeFragment;
import com.example.android.hackclubapp.MainActivity;
import com.example.android.hackclubapp.R;
import com.example.android.hackclubapp.Videos;

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.ViewHolder> {

    Videos[] videos;
    Context context;

    public VideosAdapter(Videos[] videos, Context context) {
        this.videos = videos;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.videos_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VideosAdapter.ViewHolder holder, int position) {
        final Videos videoList = videos[position];
        holder.videoImage.setImageResource(videoList.getVideoImageResourceId());
        holder.videoDesc.setText(videoList.getVideoDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = videoList.getVideoUrl();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
            return videos.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView videoImage;
        TextView videoDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            videoImage = itemView.findViewById(R.id.videoImageview);
            videoDesc = itemView.findViewById(R.id.videoDescTextview);
        }
    }
}
