package com.eamh.birdbreeding;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.eamh.birdbreeding.data.models.Bird;
import com.eamh.birdbreeding.data.models.Breed;
import com.eamh.birdbreeding.fragments.birds.BirdsFragment;
import com.eamh.birdbreeding.fragments.breeds.BreedsFragment;

public class MainActivity extends AppCompatActivity
        implements BirdsFragment.OnBirdsFragmentInteractionListener,
        BreedsFragment.OnBreedFragmentInteractionListener {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBirdsFragmentListClicked(Bird bird) {
        launchBirdDetails();
//        Snackbar.make(mViewPager, "Clicked "+bird, Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();
    }

    @Override
    public void onBreedItemListClicked(Breed breed) {
        launchBreedDetails();
//        Snackbar.make(mViewPager, "Clicked "+breed, Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();
    }

    private void launchBirdDetails() {
        Intent intent = new Intent(this, BirdDetailsActivity.class);
        startActivity(intent);
    }

    private void launchBreedDetails() {
        Intent intent = new Intent(this, BreedDetailsActivity.class);
        startActivity(intent);
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
//            return PlaceholderFragment.newInstance(position + 1);
            return position == 0 ? BirdsFragment.newInstance(1) : BreedsFragment.newInstance(1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }
    }
}
