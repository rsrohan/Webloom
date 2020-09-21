package com.rsrohanverma.webloomassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<String> images;
    private static final int TYPE_FULL = 0;
    private static final int TYPE_QUARTER = 2;

    public RecyclerAdapter(Context context, ArrayList<String> images) {
        this.context = context;
        this.images = images;

    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        if (viewType == TYPE_FULL) {
            final View itemView =
                    LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
            return new ViewHolder(itemView);
        } else {
            final View itemView =
                    LayoutInflater.from(context).inflate(R.layout.recycler_item2, parent, false);
            return new ViewHolder(itemView);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        if (position%4==0 && position!=0)
        {
            holder.image2.setVisibility(View.VISIBLE);
            Glide.with(context).load(images.get(position)).into(holder.image2);
            holder.image.setVisibility(View.VISIBLE);
            Glide.with(context).load(images.get(position-1)).into(holder.image);
        }else{
            Glide.with(context).load(images.get(position)).into(holder.image);
        }


    }

    @Override
    public int getItemViewType(int position) {
        if (position%3 == 0 || position%4 == 0) {
            return TYPE_QUARTER;
        } else {
            return TYPE_FULL;
        }
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image, image2;
        View item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            image2 = itemView.findViewById(R.id.image2);
            item = itemView;
        }
    }
}
