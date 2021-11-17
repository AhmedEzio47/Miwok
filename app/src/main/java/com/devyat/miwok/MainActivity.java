package com.devyat.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.devyat.miwok.fragments.ColorsFragment;
import com.devyat.miwok.fragments.PhrasesFragment;
import com.devyat.miwok.adapters.FragmentPagerAdapter;
import com.devyat.miwok.fragments.NumbersFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private FragmentPagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new NumbersFragment());
        fragmentList.add(new ColorsFragment());
        fragmentList.add(new PhrasesFragment());

        viewPager = findViewById(R.id.viewpager);
        pagerAdapter = new FragmentPagerAdapter(this, fragmentList);
        viewPager.setAdapter(pagerAdapter);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText(pagerAdapter.getItemTitle(position))
        ).attach();
    }

}