package com.example.recyclerviewexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Shoe> shoeList = new ArrayList<>();

    FloatingActionButton addButton;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        addButton = view.findViewById(R.id.floatingActionButton);
        shoeList.add(new Shoe(R.drawable.download, "Nike Air Max 270", "Size: 9", "$150"));
        shoeList.add(new Shoe(R.drawable.download, "Nike Air Max 270", "Size: 9", "250"));

        // Create and set the adapter
        setupRecyclerView();
        addButton.setOnClickListener(v -> {
            // Navigate to the AddFragment
            Navigation.findNavController(view).navigate(R.id.action_listFragment_to_addFragment);
        });

        return view;
    }

    private void setupRecyclerView() {
        ShoeAdapter shoeAdapter = new ShoeAdapter(shoeList);
        recyclerView.setAdapter(shoeAdapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        //or
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
    }
}