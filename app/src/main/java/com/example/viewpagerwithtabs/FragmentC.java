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


public class FragmentC extends Fragment {
    private RecyclerView recycleC;
    private List<Model> modelListC=new ArrayList<>();


    public static FragmentC instance(){
        FragmentC fragmentC=new FragmentC();
        return fragmentC;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycleC=view.findViewById(R.id.recycleviewC);
        setRecycleview();
        builddata();
    }

    private void setRecycleview() {
        Adapter adaptor = new Adapter(modelListC);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recycleC.setLayoutManager(linearLayoutManager);
        recycleC.setAdapter(adaptor);
    }


    private void builddata() {
        modelListC.add(new Model("Dal lake"));
        modelListC.add(new Model("Munnar"));
        modelListC.add(new Model("Coalker walk"));
        modelListC.add(new Model("Love lake"));
        modelListC.add(new Model("Abhay falls"));
        modelListC.add(new Model("Signature bridge"));
        modelListC.add(new Model("Pink city"));
        modelListC.add(new Model("Jantar Mantar"));
        modelListC.add(new Model("Red Fort"));
        modelListC.add(new Model("Snowfall"));
        modelListC.add(new Model("Char Minar"));
        modelListC.add(new Model("Taj Mahal"));
        modelListC.add(new Model("India Gate"));
        modelListC.add(new Model("Sahara"));
        modelListC.add(new Model("Bagha Border"));

    }
}