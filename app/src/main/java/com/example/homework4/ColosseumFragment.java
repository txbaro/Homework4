package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ColosseumFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.colosseum_image_desc));
        fact1Text.setText("Name: Colosseum");
        fact2Text.setText("Location: Rome, Italy");
        fact3Text.setText("Completed: 80 AD");
        fact4Text.setText("Capacity: ~50,000 spectators");
        fact5Text.setText("Purpose: Gladiatorial contests");
        descriptionText.setText("The Colosseum, also known as the Flavian Amphitheatre, is an iconic symbol of Imperial Rome. Completed in 80 AD under Emperor Titus, it could hold up to 50,000 spectators who gathered to watch gladiatorial contests, animal hunts, and public executions. It remains one of the greatest examples of Roman engineering and architecture.");

        return view;
    }

}