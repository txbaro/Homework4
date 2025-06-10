package com.example.homework4;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        }
        setContentView(R.layout.activity_main);

        LinearLayout countriesCard = findViewById(R.id.countriesCard);
        LinearLayout leadersCard = findViewById(R.id.leadersCard);
        LinearLayout museumsCard = findViewById(R.id.museumsCard);
        LinearLayout wondersCard = findViewById(R.id.wondersCard);

        countriesCard.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CountriesActivity.class)));
        leadersCard.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LeadersActivity.class)));
        museumsCard.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MuseumsActivity.class)));
        wondersCard.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, WondersActivity.class)));
    }
}