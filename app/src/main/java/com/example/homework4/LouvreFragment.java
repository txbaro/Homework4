package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class LouvreFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.louvre_image_desc));
        fact1Text.setText("Name: Louvre Museum");
        fact2Text.setText("Location: Paris, France");
        fact3Text.setText("Established: 1793");
        fact4Text.setText("Collection Size: ~380,000 objects");
        fact5Text.setText("Notable Artworks: Mona Lisa, Venus de Milo");
        descriptionText.setText("The Louvre Museum, located on the Seine River in Paris, is one of the world's largest and most visited art museums. Originally a royal palace, it became a museum in 1793. The Louvre houses a vast collection spanning from ancient civilizations to the first half of the 19th century, including iconic works like the Mona Lisa and the Venus de Milo.");

        return view;
    }
}
