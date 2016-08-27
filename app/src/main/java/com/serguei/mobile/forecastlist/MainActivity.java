package com.serguei.mobile.forecastlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView forecastRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forecastRecyclerView = (RecyclerView) findViewById(R.id.forecast_list);

        ForecastAdapter forecastAdapter = new ForecastAdapter(Forecast.getFakeForecasts(), MainActivity.this);

        forecastRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        forecastRecyclerView.setAdapter(forecastAdapter);

    }
}
