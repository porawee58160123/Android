package com.porawee.finalapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.porawee.finalapp.R;
import com.porawee.finalapp.Service.ModelData;
import com.porawee.finalapp.Service.ModelPhoto;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdaptor extends RecyclerView.Adapter<Holder>{


    private ModelData modelData;
    private List<ModelPhoto> photoList;
    public DataAdaptor(ModelData modelData) {

        this.modelData = modelData;
        this.photoList = modelData.getListPhoto();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.layout_cardview, parent, false);
        Holder pv = new Holder(view);
        return pv;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Picasso.get()
                .load(photoList.get(position).getPhotoURL())
                .into(holder.imagePhoto);
        holder.txt.setText(photoList.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }
}
