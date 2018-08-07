package com.eamh.birdbreeding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.eamh.birdbreeding.data.models.LayEgg;
import com.eamh.birdbreeding.fragments.breeddetail.BreedDetailsFragment;

public class BreedDetailsActivity extends AppCompatActivity
        implements BreedDetailsFragment.OnBreedFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onPuestaListClicked(LayEgg layEgg) {
        launchPuestaDetails(layEgg);
    }

    private void launchPuestaDetails(LayEgg layEgg) {
        Intent intent = new Intent(this, PuestaDetailsActivity.class);
        startActivity(intent);
    }
}
