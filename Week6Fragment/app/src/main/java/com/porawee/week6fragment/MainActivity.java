package com.porawee.week6fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChangeFragment (View view) {
        Fragment fragment;
        if (view == findViewById(R.id.BtnFragmentRegis)) {
            fragment = new Fragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.FragmentDetail, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.BtnFragmentProfile)) {
            fragment = new ProfileFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.FragmentDetail, fragment);
            ft.commit();
        }
    }
}
