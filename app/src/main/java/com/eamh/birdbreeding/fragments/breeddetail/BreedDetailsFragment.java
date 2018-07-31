package com.eamh.birdbreeding.fragments.breeddetail;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eamh.birdbreeding.R;
import com.eamh.birdbreeding.data.dummy.DummyPuesta;
import com.eamh.birdbreeding.data.models.Puesta;

/**
 * A placeholder fragment containing a simple view.
 */
public class BreedDetailsFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnBreedFragmentInteractionListener mListener;

    private ImageView ivFemalePhoto;
    private TextView tvFemaleAnilla;
    private TextView tvFemaleCode;

    private ImageView ivMalePhoto;
    private TextView tvMaleAnilla;
    private TextView tvMaleCode;

    private RecyclerView rvPuestas;

    private FloatingActionButton fabAddPuesta;

    public BreedDetailsFragment() {
    }

    public static BreedDetailsFragment newInstance(int columnCount) {
        BreedDetailsFragment fragment = new BreedDetailsFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_breed_details, container, false);

        ivFemalePhoto = rootView.findViewById(R.id.ivFemalePhoto);
        tvFemaleAnilla = rootView.findViewById(R.id.tvFemaleAnilla);
        tvFemaleCode = rootView.findViewById(R.id.tvFemaleCode);

        ivMalePhoto = rootView.findViewById(R.id.ivMalePhoto);
        tvMaleAnilla = rootView.findViewById(R.id.tvMaleAnilla);
        tvMaleCode = rootView.findViewById(R.id.tvMaleCode);

        rvPuestas = rootView.findViewById(R.id.rvPuestas);
        fabAddPuesta = rootView.findViewById(R.id.fabAddPuesta);

        rvPuestas.setAdapter(new PuestasRecyclerViewAdapter(DummyPuesta.ITEMS, mListener));

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnBreedFragmentInteractionListener) {
            mListener = (OnBreedFragmentInteractionListener) context;
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

    public interface OnBreedFragmentInteractionListener {
        void onPuestaListClicked(Puesta puesta);
    }
}
