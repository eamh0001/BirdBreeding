package com.eamh.birdbreeding.fragments.puestadetail;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.eamh.birdbreeding.R;
import com.eamh.birdbreeding.data.models.LayEggItem;
import com.eamh.birdbreeding.fragments.breeds.BreedsFragment.OnBreedFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link LayEggItem} and makes a call to the
 * specified {@link OnBreedFragmentInteractionListener}.
 */
public class PuestaItemRecyclerViewAdapter extends RecyclerView.Adapter<PuestaItemRecyclerViewAdapter.ViewHolder> {

    private final List<LayEggItem> layEggItems;
    private final PuestaItemRecyclerViewListener mListener;

    public PuestaItemRecyclerViewAdapter(List<LayEggItem> items, PuestaItemRecyclerViewListener listener) {
        layEggItems = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_puesta_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final LayEggItem layEggItem = layEggItems.get(position);
        holder.mImageView.setImageResource(getColorByType(layEggItem));

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onPuestaItemClicked(layEggItem);
                }
            }
        });
    }

    private int getColorByType(LayEggItem layEggItem) {
        return layEggItem.get_id() % 2 == 0 ? R.color.colorAccent : R.color.colorPrimary;
    }

    @Override
    public int getItemCount() {
        return layEggItems.size();
    }

    public interface PuestaItemRecyclerViewListener {
        void onPuestaItemClicked(LayEggItem layEggItem);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView mImageView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mImageView = view.findViewById(R.id.ivPuestaItemImage);
        }
    }
}
