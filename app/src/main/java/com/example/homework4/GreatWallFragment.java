package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class GreatWallFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        ImageView infoImage = view.findViewById(R.id.infoImage);
        TextView fact1Text = view.findViewById(R.id.fact1Text);
        TextView fact2Text = view.findViewById(R.id.fact2Text);
        TextView fact3Text = view.findViewById(R.id.fact3Text);
        TextView fact4Text = view.findViewById(R.id.fact4Text);
        TextView fact5Text = view.findViewById(R.id.fact5Text);
        TextView descriptionText = view.findViewById(R.id.descriptionText);

        infoImage.setImageResource(R.drawable.otf);
        infoImage.setContentDescription(getString(R.string.great_wall_image_desc));
        fact1Text.setText("Name: Great Wall of China");
        fact2Text.setText("Location: China");
        fact3Text.setText("Length: ~21,196 km");
        fact4Text.setText("Construction: Began 221 BC");
        fact5Text.setText("Purpose: Defense against invaders");
        descriptionText.setText("The Great Wall of China is a series of fortifications built to protect Chinese states against various nomadic groups, particularly the Mongols. Construction began in 221 BC under Emperor Qin Shi Huang, with major expansions during the Ming Dynasty. Spanning over 21,196 kilometers, it is one of the most iconic architectural feats in history.");

        return view;
    }
}