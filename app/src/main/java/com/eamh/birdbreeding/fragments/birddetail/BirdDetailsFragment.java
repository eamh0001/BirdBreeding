package com.eamh.birdbreeding.fragments.birddetail;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.eamh.birdbreeding.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BirdDetailsFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnBirdDetailsFragmentInteractionListener mListener;

    private ImageView birdPhoto;
    private Spinner spGenre;
    private Spinner spStatus;
    private EditText etRaceValue;
    private EditText etVariationValue;
    private EditText etRingValue;
    private EditText etCodeValue;
    private EditText etBirthDate;
    private EditText etProcedence;
    private Button btOrigin;
    private Button btDescendants;
    private EditText etAnnotations;
    private FloatingActionButton fabSave;

    public BirdDetailsFragment() {
    }

    public static BirdDetailsFragment newInstance(int columnCount) {
        BirdDetailsFragment fragment = new BirdDetailsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnBirdDetailsFragmentInteractionListener) {
            mListener = (OnBirdDetailsFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnBreedFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bird_details, container, false);
    }

    public interface OnBirdDetailsFragmentInteractionListener {

    }
}
