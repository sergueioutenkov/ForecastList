package com.serguei.mobile.forecastlist;// Created by Serguei Outenkov on 8/26/16.

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    private List<Forecast> forecasts;
    private Context context;

    private static final int TODAY = 0;
    private static final int OTHER_DAY = 1;

    public ForecastAdapter(List<Forecast> forecasts, Context context) {
        this.forecasts = forecasts;
        this.context = context;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case TODAY:
                return new ForecastViewHolder(LayoutInflater.from(context).inflate(R.layout.forecast_list_item_today, parent, false));
            case OTHER_DAY:
                return new ForecastViewHolder(LayoutInflater.from(context).inflate(R.layout.forecast_list_item, parent, false));
            default:
                return new ForecastViewHolder(LayoutInflater.from(context).inflate(R.layout.forecast_list_item, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, final int position) {
        Forecast forecast = forecasts.get(position);

        holder.image.setImageResource(forecast.getImage());
        holder.location.setText(forecast.getLocation());
        holder.description.setText(forecast.getDescription());
        holder.temperature.setText(forecast.getTemperature());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return forecasts.size();
    }

    static class ForecastViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView location;
        TextView description;
        TextView temperature;

        public ForecastViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.forecast_list_item_image);
            location = (TextView) itemView.findViewById(R.id.forecast_list_item_location);
            description = (TextView) itemView.findViewById(R.id.forecast_list_item_description);
            temperature = (TextView) itemView.findViewById(R.id.forecast_list_item_temperature);
        }
    }


    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TODAY;
        } else {
            return OTHER_DAY;
        }
    }

    private void remove(int position){
        forecasts.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, forecasts.size());
    }
}
