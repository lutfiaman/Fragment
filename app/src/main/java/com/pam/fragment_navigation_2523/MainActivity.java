package com.pam.fragment_navigation_2523;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        HomeFragment mHomeFragment = new HomeFragment();

        Fragment fragment = mFragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        if (!(fragment instanceof HomeFragment)){
            mFragmentManager.beginTransaction()
                    .add(R.id.frame_container,mHomeFragment,HomeFragment.class.getSimpleName())
                    .commit();
        }
    }
}