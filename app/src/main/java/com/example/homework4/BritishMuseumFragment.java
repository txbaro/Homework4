package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class BritishMuseumFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.british_museum_image_desc));
        fact1Text.setText("Name: British Museum");
        fact2Text.setText("Location: London, UK");
        fact3Text.setText("Established: 1753");
        fact4Text.setText("Collection Size: ~8 million objects");
        fact5Text.setText("Notable Artworks: Rosetta Stone, Elgin Marbles");
        descriptionText.setText("The British Museum in London is dedicated to human history, art, and culture, with a collection of over 8 million objects. Founded in 1753, it was the first public museum of its kind. Key artifacts include the Rosetta Stone, which helped decipher Egyptian hieroglyphs, and the Elgin Marbles from the Parthenon in Athens.");

        return view;
    }
}
