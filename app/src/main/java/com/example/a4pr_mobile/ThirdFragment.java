package com.example.a4pr_mobile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.example.a4pr_mobile.databinding.FragmentSecondBinding;
import com.example.a4pr_mobile.databinding.FragmentThirdBinding;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    private RecyclerView itemsList;
    private RecyclerViewAdapter adapter;
    private final List<Item> items = new ArrayList<>();

    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstance) {
        items.add(new Item("I am the first", R.drawable.person));
        items.add(new Item("I am the second", R.drawable.person));
        items.add(new Item("I am the third", R.drawable.person));

        itemsList = view.findViewById(R.id.thirdFragRecyclerView);
        adapter = new RecyclerViewAdapter(getContext(), items);
        itemsList.setAdapter(adapter);
    }
}