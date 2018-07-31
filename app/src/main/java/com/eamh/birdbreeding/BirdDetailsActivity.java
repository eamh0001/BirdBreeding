package com.eamh.birdbreeding;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.eamh.birdbreeding.fragments.birddetail.BirdDetailsFragment;

public class BirdDetailsActivity extends AppCompatActivity
        implements BirdDetailsFragment.OnBirdDetailsFragmentInteractionListener {

    ImageView birdPhoto;
    Spinner spGenre;
    Spinner spStatus;
    EditText etRaceValue;
    EditText etVariationValue;
    EditText etRingValue;
    EditText etCodeValue;
    EditText etBirthDate;
    EditText etProcedence;
    Button btOrigin;
    Button btDescendants;
    EditText etAnnotations;
    FloatingActionButton fabSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
