package com.example.csaenz.hungrysf;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.tabs)
    TabLayout mTabsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Views to ensure not Null
        ButterKnife.bind(this);

        // Setup Toolbar for Title of App
        setSupportActionBar(mToolbar);

        // Create the adapter that will return a fragment for each of the four
        // primary sections of the activity.
        FragmentAdapter fragmentAdapter = new FragmentAdapter(this, getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager.setAdapter(fragmentAdapter);

        // Set up tabs with ViewPager
        mTabsLayout.setupWithViewPager(mViewPager);
    }
}
