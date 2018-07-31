package com.eamh.birdbreeding.fragments.puestadetail;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eamh.birdbreeding.R;
import com.eamh.birdbreeding.data.dummy.DummyPuestaItem;
import com.eamh.birdbreeding.data.models.PuestaItem;

/**
 * A placeholder fragment containing a simple view.
 */
public class PuestaFragment extends Fragment
        implements PuestaItemRecyclerViewAdapter.PuestaItemRecyclerViewListener {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnPuestaFragmentInteractionListener mListener;

    private EditText etJaulaNumber;
    private RecyclerView rvPuestaItems;
    private FloatingActionButton fabAddEgg;
    private LinearLayout llDataContainer;
    private EditText etPuestaDate;
    private CheckBox cbBadEgg;
    private EditText etBirthDate;
    private EditText etAnillaDate;
    private CheckBox cbDied;

    private LinearLayout llGrowBirdDataContainer;
    private ImageView ivBirdPhoto;
    private TextView tvGenre;
    private TextView tvAnilla;

    public PuestaFragment() {
    }

    public static PuestaFragment newInstance(int columnCount) {
        PuestaFragment fragment = new PuestaFragment();
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
        if (context instanceof OnPuestaFragmentInteractionListener) {
            mListener = (OnPuestaFragmentInteractionListener) context;
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
        View rootView = inflater.inflate(R.layout.fragment_puesta, container, false);

        etJaulaNumber = rootView.findViewById(R.id.etJaulaNumber);
        rvPuestaItems = rootView.findViewById(R.id.rvPuestaItems);
        rvPuestaItems.setAdapter(new PuestaItemRecyclerViewAdapter(DummyPuestaItem.ITEMS, this));
        etPuestaDate = rootView.findViewById(R.id.etPuestaDate);
        cbBadEgg = rootView.findViewById(R.id.cbBadEgg);
        etBirthDate = rootView.findViewById(R.id.etBirthDate);
        etAnillaDate = rootView.findViewById(R.id.etAnillaDate);
        cbDied = rootView.findViewById(R.id.cbDied);
        llGrowBirdDataContainer = rootView.findViewById(R.id.llGrowBirdDataContainer);
        ivBirdPhoto = rootView.findViewById(R.id.ivBirdPhoto);
        tvGenre = rootView.findViewById(R.id.tvGenre);
        tvAnilla = rootView.findViewById(R.id.tvAnilla);

        FloatingActionButton fab = rootView.findViewById(R.id.fabAddEgg);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEgg();
            }
        });

        return rootView;
    }

    private void addEgg() {
        //TODO add egg to list and open conf panel
    }

    @Override
    public void onPuestaItemClicked(PuestaItem puestaItem) {

    }


    public interface OnPuestaFragmentInteractionListener {

    }
}
