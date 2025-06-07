package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class UKFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.uk_flag_desc));
        fact1Text.setText("Capital: London");
        fact2Text.setText("Largest City: London");
        fact3Text.setText("National Language: English");
        fact4Text.setText("F Total Area: 242,495 km²");
        fact5Text.setText("Currency: GBP");
        descriptionText.setText("The United Kingdom of Great Britain and Northern Ireland, commonly known as the United Kingdom (UK) or Britain, is a country in Northwestern Europe, off the coast of the continental mainland. It comprises England, Scotland, Wales, and Northern Ireland. The UK includes the island of Great Britain, the north-eastern part of the island of Ireland, and most of the smaller islands within the British Isles, covering 94,354 square miles (244,376 km²). Northern Ireland shares a land border with the Republic of Ireland; otherwise, the United Kingdom is surrounded by the Atlantic Ocean, the North Sea, the English Channel, the Celtic Sea, and the Irish Sea.");

        return view;
    }
}
