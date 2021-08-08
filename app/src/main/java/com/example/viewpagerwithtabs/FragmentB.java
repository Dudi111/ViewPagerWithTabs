package com.example.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentB extends Fragment {
    private RecyclerView recycleB;
    private List<Model> modelListB=new ArrayList<>();


    public static FragmentB instance(){
        FragmentB fragmentB=new FragmentB();
        return fragmentB;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycleB=view.findViewById(R.id.recycleviewB);
        setRecycleview();
        builddata();
    }

    private void setRecycleview() {
        Adapter adaptor = new Adapter(modelListB);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recycleB.setLayoutManager(linearLayoutManager);
        recycleB.setAdapter(adaptor);
    }


    private void builddata() {
        modelListB.add(new Model("Rajasthan"));
        modelListB.add(new Model("Bikaner"));
        modelListB.add(new Model("Delhi"));
        modelListB.add(new Model("Kolkata"));
        modelListB.add(new Model("Himachal"));
        modelListB.add(new Model("Assam"));
        modelListB.add(new Model("Manipur"));
        modelListB.add(new Model("Goa"));
        modelListB.add(new Model("Meghalaya"));
        modelListB.add(new Model("Kashmir"));
        modelListB.add(new Model("Jammu"));
        modelListB.add(new Model("Ooty"));
        modelListB.add(new Model("Mumbai"));
        modelListB.add(new Model("Kerala"));
        modelListB.add(new Model("Mizoram"));
        modelListB.add(new Model("Tamilnadu"));
        modelListB.add(new Model("Arunachal"));
    }
}