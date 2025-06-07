package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class UffiziFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.uffizi_image_desc));
        fact1Text.setText("Name: Uffizi Gallery");
        fact2Text.setText("Location: Florence, Italy");
        fact3Text.setText("Established: 1581");
        fact4Text.setText("Collection Size: ~1,500 artworks");
        fact5Text.setText("Notable Artworks: The Birth of Venus, La Primavera");
        descriptionText.setText("The Uffizi Gallery in Florence is one of the most important art museums in the world, renowned for its collection of Renaissance art. Commissioned by the Medici family, it opened to the public in 1765. The gallery is famous for works by Botticelli, including The Birth of Venus and La Primavera, as well as pieces by Leonardo da Vinci and Michelangelo.");

        return view;
    }
}
