package com.example.homework4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Leader1Fragment extends Fragment {

    private ProgressBar progressBar;
    private View contentLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        progressBar = view.findViewById(R.id.leaderProgressBar);
        contentLayout = view.findViewById(R.id.contentLayout);

        progressBar.setVisibility(View.VISIBLE);
        contentLayout.setVisibility(View.GONE);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            progressBar.setVisibility(View.GONE);
            contentLayout.setVisibility(View.VISIBLE);
        }, 1500);

        ImageView infoImage = view.findViewById(R.id.infoImage);
        TextView fact1Text = view.findViewById(R.id.fact1Text);
        TextView fact2Text = view.findViewById(R.id.fact2Text);
        TextView fact3Text = view.findViewById(R.id.fact3Text);
        TextView fact4Text = view.findViewById(R.id.fact4Text);
        TextView fact5Text = view.findViewById(R.id.fact5Text);
        TextView descriptionText = view.findViewById(R.id.descriptionText);

        infoImage.setImageResource(R.drawable.keir_starmer);
        infoImage.setContentDescription(getString(R.string.leader1_image_desc));
        fact1Text.setText("Name: Keir Starmer");
        fact2Text.setText("Country: United Kingdom");
        fact3Text.setText("Position: Prime Minister");
        fact4Text.setText("Since: July 2024");
        fact5Text.setText("Party: Labour Party");
        descriptionText.setText("Keir Starmer is the Prime Minister of the United Kingdom, having assumed office in July 2024...");

        return view;
    }
}