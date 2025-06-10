package com.example.homework4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class UKFragment extends Fragment {

    private ProgressBar progressBar;
    private View contentLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        progressBar = view.findViewById(R.id.leaderProgressBar);
        contentLayout = view.findViewById(R.id.contentLayout);

        progressBar.setVisibility(View.VISIBLE);
        contentLayout.setVisibility(View.GONE);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            progressBar.setVisibility(View.GONE);
            contentLayout.setVisibility(View.VISIBLE);
        }, 1500);

        ImageView infoImage = view.findViewById(R.id.infoImage);
        TextView fact1Text = view.findViewById(R.id.fact1Text);
        TextView fact2Text = view.findViewById(R.id.fact2Text);
        TextView fact3Text = view.findViewById(R.id.fact3Text);
        TextView fact4Text = view.findViewById(R.id.fact4Text);
        TextView fact5Text = view.findViewById(R.id.fact5Text);
        TextView descriptionText = view.findViewById(R.id.descriptionText);

        infoImage.setImageResource(R.drawable.uk);
        infoImage.setContentDescription(getString(R.string.uk_flag_desc));
        fact1Text.setText("Name: United Kingdom");
        fact2Text.setText("Capital: London");
        fact3Text.setText("Population: ~67 million");
        fact4Text.setText("Language: English");
        fact5Text.setText("Currency: Pound Sterling");
        descriptionText.setText("The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "" +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "The United Kingdom, comprising England, Scotland, Wales, and Northern Ireland, is known for its rich history, cultural heritage, and global influence. London, its capital, is a major financial and cultural hub." +
                "");

        return view;
    }
}