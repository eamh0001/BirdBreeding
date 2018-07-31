package com.eamh.birdbreeding.fragments.breeds;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eamh.birdbreeding.R;
import com.eamh.birdbreeding.data.models.Breed;
import com.eamh.birdbreeding.fragments.breeds.BreedsFragment.OnBreedFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Breed} and makes a call to the
 * specified {@link OnBreedFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class BreedsRecyclerViewAdapter extends RecyclerView.Adapter<BreedsRecyclerViewAdapter.ViewHolder> {

    private final List<Breed> breedValues;
    private final OnBreedFragmentInteractionListener mListener;

    public BreedsRecyclerViewAdapter(List<Breed> items, OnBreedFragmentInteractionListener listener) {
        breedValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_breed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Breed breed = breedValues.get(position);
        holder.mIdView.setText("" + position);
        holder.mContentView.setText("breed " + position);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onBreedItemListClicked(breed);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return breedValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = view.findViewById(R.id.item_number);
            mContentView = view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
