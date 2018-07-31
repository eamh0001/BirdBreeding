package com.eamh.birdbreeding.fragments.breeddetail;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eamh.birdbreeding.R;
import com.eamh.birdbreeding.data.models.Bird;
import com.eamh.birdbreeding.data.models.BirdBaby;
import com.eamh.birdbreeding.data.models.Puesta;
import com.eamh.birdbreeding.data.models.PuestaItem;
import com.eamh.birdbreeding.fragments.birds.BirdsFragment.OnBirdsFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Bird} and makes a call to the
 * specified {@link OnBirdsFragmentInteractionListener}.
 */
public class PuestasRecyclerViewAdapter extends RecyclerView.Adapter<PuestasRecyclerViewAdapter.ViewHolder> {

    private final List<Puesta> puestas;
    private final BreedDetailsFragment.OnBreedFragmentInteractionListener mListener;

    public PuestasRecyclerViewAdapter(List<Puesta> items, BreedDetailsFragment.OnBreedFragmentInteractionListener listener) {
        puestas = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_puesta, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Context context = holder.mView.getContext();
        final Puesta puesta = puestas.get(position);
        holder.tvStartDate.setText(DateUtils.formatDateTime(context, puesta.getPuestaDate().getTime(), DateUtils.FORMAT_NUMERIC_DATE));
        holder.tvJaulaNumber.setText(String.valueOf(puesta.getJaulaNumber()));
        int[] totalEggs = computeTotalAndSuccessfulEggs(puesta);
        holder.tvEggsSuccess.setText(context.getString(R.string.format_eggs_success, totalEggs[0], totalEggs[1]));

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onPuestaListClicked(puesta);
                }
            }
        });
    }

    private int[] computeTotalAndSuccessfulEggs(Puesta puesta) {
        int[] puestaRatioInfo = new int[2];
        if (puesta != null) {
            int totalEggs = puesta.getPuestaItems().size();
            int successfulEggs = 0;

            for (PuestaItem puestaItem : puesta.getPuestaItems()) {
                BirdBaby birdBaby = puestaItem.getBirdBaby();
                if (birdBaby != null && !birdBaby.isDead()) {
                    successfulEggs++;
                }
            }
            puestaRatioInfo[0] = totalEggs;
            puestaRatioInfo[1] = successfulEggs;
        }
        return puestaRatioInfo;
    }

    @Override
    public int getItemCount() {
        return puestas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView tvStartDate;
        public final TextView tvJaulaNumber;
        public final TextView tvEggsSuccess;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            tvStartDate = view.findViewById(R.id.tvStartDate);
            tvJaulaNumber = view.findViewById(R.id.tvJaulaNumber);
            tvEggsSuccess = view.findViewById(R.id.tvEggsSuccess);
        }
    }
}
