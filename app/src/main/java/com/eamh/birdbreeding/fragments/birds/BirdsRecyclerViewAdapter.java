package com.eamh.birdbreeding.fragments.birds;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eamh.birdbreeding.R;
import com.eamh.birdbreeding.data.models.Bird;
import com.eamh.birdbreeding.fragments.birds.BirdsFragment.OnBirdsFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Bird} and makes a call to the
 * specified {@link OnBirdsFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class BirdsRecyclerViewAdapter extends RecyclerView.Adapter<BirdsRecyclerViewAdapter.ViewHolder> {

    private final List<Bird> birdsValues;
    private final OnBirdsFragmentInteractionListener mListener;

    public BirdsRecyclerViewAdapter(List<Bird> items, OnBirdsFragmentInteractionListener listener) {
        birdsValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_bird, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Bird bird = birdsValues.get(position);
        holder.mIdView.setText("" + position);
        holder.mContentView.setText(bird.getPetName());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onBirdsFragmentListClicked(bird);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return birdsValues.size();
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
