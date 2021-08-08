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


public class FragmentA extends Fragment {
private RecyclerView recycleA;
private List<Model> modelListA=new ArrayList<>();

  
   public static FragmentA instance(){
       FragmentA fragmentA=new FragmentA();
       return fragmentA;
   }



@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycleA=view.findViewById(R.id.recycleviewA);
        setRecycleview();
        builddata();

    }

    private void setRecycleview() {
        Adapter adaptor = new Adapter(modelListA);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recycleA.setLayoutManager(linearLayoutManager);
        recycleA.setAdapter(adaptor);
    }

    private void builddata() {
       modelListA.add(new Model("Ram"));
        modelListA.add(new Model("Laxman"));
        modelListA.add(new Model("Bharat"));
        modelListA.add(new Model("Sita"));
        modelListA.add(new Model("Parvati"));
        modelListA.add(new Model("Durga"));
        modelListA.add(new Model("Krishan"));
        modelListA.add(new Model("Balram"));
        modelListA.add(new Model("Kanhaiya"));
        modelListA.add(new Model("Laxmi"));
        modelListA.add(new Model("Sarswati"));
        modelListA.add(new Model("Kali"));
        modelListA.add(new Model("Hanuman"));
        modelListA.add(new Model("Ganesh"));
        modelListA.add(new Model("Shiv"));
        modelListA.add(new Model("Bholenath"));
        modelListA.add(new Model("Vishnu"));
    }
}