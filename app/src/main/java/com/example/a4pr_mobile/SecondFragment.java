package com.example.a4pr_mobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.a4pr_mobile.databinding.FragmentSecondBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    private final List<Item> items = new ArrayList<>();

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstance) {
        items.addAll(ListGenerator.gen(R.drawable.person, "Пациент", 200));

        ListView secondFragListView = binding.secondFragListView;
        ListAdapter adapter = new ListViewAdapter(getContext(), R.layout.item, items);
        secondFragListView.setAdapter(adapter);
        secondFragListView.setOnItemClickListener((parent, v, position, id) -> {

        });
    }
}