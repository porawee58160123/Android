package com.porawee.finalapp.Service;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelData {
    @SerializedName("status")
    private String status;

    @SerializedName("posts")
    private List<ModelPhoto> listPhoto;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ModelPhoto> getListPhoto() {
        return listPhoto;
    }

    public void setListPhoto(List<ModelPhoto> listPhoto) {
        this.listPhoto = listPhoto;
    }
}
