package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Leader3Fragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.leader3_image_desc));
        fact1Text.setText("Name: Emmanuel Macron");
        fact2Text.setText("Country: France");
        fact3Text.setText("Position: President");
        fact4Text.setText("Since: May 2017");
        fact5Text.setText("Party: La République En Marche!");
        descriptionText.setText("Emmanuel Macron has been the President of France since May 2017 and was re-elected in 2022. A centrist leader of La République En Marche!, Macron has focused on economic reforms, climate change initiatives, and strengthening the European Union, while also addressing domestic challenges like pension reform protests.");

        return view;
    }
}