package com.example.homework4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WonderPagerAdapter extends FragmentStateAdapter {

    public WonderPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new GreatWallFragment();
            case 1:
                return new ColosseumFragment();
            case 2:
                return new TajMahalFragment();
            default:
                return new GreatWallFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
