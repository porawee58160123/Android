package com.porawee.finalapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.porawee.finalapp.Adapter.DataAdaptor;
import com.porawee.finalapp.Service.HttpManager;
import com.porawee.finalapp.Service.ModelData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
//    List<ModelData> data;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = null ;
        layout = inflater.inflate(R.layout.fragment_blank, container, false);

        recyclerView = layout.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        getDataService();

        return layout;
    }

    private void getDataService() {
        Call<ModelData> call = HttpManager.getInstance().getService().getDataMovie();
        call.enqueue(new Callback<ModelData>() {
            @Override
            public void onResponse(Call<ModelData> call, Response<ModelData> response) {
                if (response.isSuccessful()){
                    ModelData data = response.body();
                    DataAdaptor dataAdaptor = new DataAdaptor(data);
                    recyclerView.setAdapter(dataAdaptor);
                }
            }

            @Override
            public void onFailure(Call<ModelData> call, Throwable t) {

            }
        });
    }

}
