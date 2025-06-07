package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class TajMahalFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.taj_mahal_image_desc));
        fact1Text.setText("Name: Taj Mahal");
        fact2Text.setText("Location: Agra, India");
        fact3Text.setText("Completed: 1653");
        fact4Text.setText("Commissioned by: Emperor Shah Jahan");
        fact5Text.setText("Purpose: Mausoleum for Mumtaz Mahal");
        descriptionText.setText("The Taj Mahal is an ivory-white marble mausoleum on the bank of the Yamuna River in Agra, India. Commissioned by Emperor Shah Jahan in memory of his wife Mumtaz Mahal, it was completed in 1653. A masterpiece of Mughal architecture, it is renowned for its symmetry, intricate carvings, and the love story behind its creation.");

        return view;
    }
}