package com.eamh.birdbreeding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.eamh.birdbreeding.fragments.puestadetail.PuestaFragment;

public class PuestaDetailsActivity extends AppCompatActivity
        implements PuestaFragment.OnPuestaFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puesta);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
