package com.example.a4pr_mobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a4pr_mobile.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view,
                            FirstFragment.class, null)
                    .commit();
        }
    }
}