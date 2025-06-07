package com.example.homework4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import android.os.Handler;
import android.os.Looper;

public class LeadersActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);

        // Set up Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> {
            startActivity(new Intent(LeadersActivity.this, MainActivity.class));
            finish();
        });

        // Find views
        progressBar = findViewById(R.id.progressBar);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        // Hiện progress và ẩn các thành phần khác
        progressBar.setVisibility(View.VISIBLE);
        tabLayout.setVisibility(View.GONE);
        viewPager.setVisibility(View.GONE);

        // Loading giả lập trong 1.5 giây
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            // Set adapter cho viewPager
            LeaderPagerAdapter adapter = new LeaderPagerAdapter(this);
            viewPager.setAdapter(adapter);

            // Gắn tab
            new TabLayoutMediator(tabLayout, viewPager,
                    (tab, position) -> {
                        switch (position) {
                            case 0: tab.setText("Keir Starmer"); break;
                            case 1: tab.setText("Giorgia Meloni"); break;
                            case 2: tab.setText("Emmanuel Macron"); break;
                        }
                    }).attach();

            // Sau khi load xong → ẩn progress, hiện nội dung
            progressBar.setVisibility(View.GONE);
            tabLayout.setVisibility(View.VISIBLE);
            viewPager.setVisibility(View.VISIBLE);

        }, 1500);
    }
}
