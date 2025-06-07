package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Leader2Fragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.leader2_image_desc));
        fact1Text.setText("Name: Giorgia Meloni");
        fact2Text.setText("Country: Italy");
        fact3Text.setText("Position: Prime Minister");
        fact4Text.setText("Since: October 2022");
        fact5Text.setText("Party: Brothers of Italy");
        descriptionText.setText("Giorgia Meloni is Italy's first female Prime Minister, in office since October 2022. As the leader of the Brothers of Italy party, she has focused on immigration reform, economic growth, and preserving Italian cultural identity, while also navigating Italy's role in the European Union.");

        return view;
    }
}
