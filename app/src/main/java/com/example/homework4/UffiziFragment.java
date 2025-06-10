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

public class UffiziFragment extends Fragment {

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

        infoImage.setImageResource(R.drawable.uffizi);
        infoImage.setContentDescription(getString(R.string.uffizi_image_desc));
        fact1Text.setText("Name: Uffizi Gallery");
        fact2Text.setText("Location: Florence, Italy");
        fact3Text.setText("Established: 1581");
        fact4Text.setText("Collection Size: ~2,200 artworks");
        fact5Text.setText("Notable Artworks: The Birth of Venus, La Primavera");
        descriptionText.setText("The Uffizi Gallery in Florence is renowned for its collection of Renaissance art. Established in 1581, it houses masterpieces by Botticelli, Michelangelo, and Leonardo da Vinci, including The Birth of Venus and La Primavera.");

        return view;
    }
}