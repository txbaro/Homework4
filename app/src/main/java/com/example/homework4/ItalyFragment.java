package com.example.homework4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ItalyFragment extends Fragment {

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
        infoImage.setContentDescription(getString(R.string.italy_flag_desc));
        fact1Text.setText("Capital: Rome");
        fact2Text.setText("Largest City: Rome");
        fact3Text.setText("National Language: Italian");
        fact4Text.setText("F Total Area: 301,340 km²");
        fact5Text.setText("Currency: Euro");
        descriptionText.setText("Italy, officially the Italian Republic, is a country in Southern Europe, known for its rich history, art, and cuisine. Located on the Italian Peninsula, it includes the islands of Sicily and Sardinia. Italy is famous for historical landmarks like the Colosseum, the Leaning Tower of Pisa, and the Vatican City, as well as its contributions to art through the Renaissance, led by figures like Michelangelo and Leonardo da Vinciháduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuufshdgfjsgdfgsdfgbhdbfhsdvgfvsdycbysdgbcsgydbcgysdbcgybsdgycbsdygcbsydcbygsdbvctysdvcgysdvcyvsdycvsdycvsydcvsydvcysgdcvysdcvysduhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggmádnasmdbjkasbdjkasdbasdbuiasbduiasuifcausfuiasfuiabsiufasuidiausfuiasbfuiasuifhiuhasuifbasuifbuiasfiuasbfuiasbfuiasbfuiabsfuibasiufbausifbvasuifbasuifoiahasfhasihfasiuhbasiugfuasihfuiasbvguasbaugisbfhasu9fhasiugfasugfuiashgfuiasbguoihasbnoigshasoighasuiignausoghuasnghuoasnghoiasxnguoiahnsigohansoighasoighaoishgioashgioashgoiashgoiashgokashiguhasg.");

        return view;
    }
}