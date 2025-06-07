package com.example.homework4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MuseumPagerAdapter extends FragmentStateAdapter {

    public MuseumPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new LouvreFragment();
            case 1:
                return new UffiziFragment();
            case 2:
                return new BritishMuseumFragment();
            default:
                return new LouvreFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}