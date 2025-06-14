package com.example.homework4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LeaderPagerAdapter extends FragmentStateAdapter {

    public LeaderPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Leader1Fragment();
            case 1:
                return new Leader2Fragment();
            case 2:
                return new Leader3Fragment();
            default:
                return new Leader1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}