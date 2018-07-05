package com.porawee.finalapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.porawee.finalapp.R;

public class Holder extends RecyclerView.ViewHolder{

    ImageView imagePhoto;
    TextView txt;

    public Holder(View itemView) {
        super(itemView);
        imagePhoto = itemView.findViewById(R.id.im_photo);
        txt = itemView.findViewById(R.id.txt_title);

    }
}
