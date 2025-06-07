package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class FranceFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.france_flag_desc));
        fact1Text.setText("Capital: Paris");
        fact2Text.setText("Largest City: Paris");
        fact3Text.setText("National Language: French");
        fact4Text.setText("F Total Area: 643,801 km²");
        fact5Text.setText("Currency: Euro");
        descriptionText.setText("France, officially the French Republic, is a country in Western Europe known for its cultural influence, history, and landmarks. It spans from the Mediterranean Sea to the English Channel and includes overseas territories. France is renowned for the Eiffel Tower, the Louvre Museum, and its contributions to art, fashion, and cuisine, including iconic dishes like croissants and wine.");

        return view;
    }
}
