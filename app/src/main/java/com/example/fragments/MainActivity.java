package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Fragments_activity_class fragmentsA = new Fragments_activity_class();
        Fragments_activity_class fragmentsB = new Fragments_activity_class();
        Fragments_activity_class fragmentsC = new Fragments_activity_class();

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.framelayout0,fragmentsA)
                .commit();

        fragmentManager.beginTransaction()
                .add(R.id.framelayout1,fragmentsB)
                .commit();
        fragmentManager.beginTransaction()
                .add(R.id.framelayout2,fragmentsC)
                .commit();

    }
}
