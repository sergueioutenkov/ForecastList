package com.serguei.mobile.forecastlist;// Created by Serguei Outenkov on 8/26/16.

import java.util.ArrayList;
import java.util.List;

public class Forecast {
    private int image;
    private String location;
    private String description;
    private String temperature;


    public Forecast(int image, String location, String description, String temperature) {
        this.image = image;
        this.location = location;
        this.description = description;
        this.temperature = temperature;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public static List<Forecast> getFakeForecasts(){
        List<Forecast> forecasts = new ArrayList<>();

        Forecast forecast1 = new Forecast(R.drawable.ic_cloudy, "Mendoza", "Parcialmente Nublado", "20°C");
        Forecast forecast2 = new Forecast(R.drawable.ic_rainy, "Mendoza", "Lluvia", "19°C");
        Forecast forecast3 = new Forecast(R.drawable.ic_cloudy, "Mendoza", "Nublado", "19°C");
        Forecast forecast4 = new Forecast(R.drawable.ic_sunny, "Mendoza", "Soleado", "22°C");
        Forecast forecast5 = new Forecast(R.drawable.ic_sunny, "Mendoza", "Soleado", "23°C");
        Forecast forecast6 = new Forecast(R.drawable.ic_sunny, "Mendoza", "Soleado", "24°C");
        Forecast forecast7 = new Forecast(R.drawable.ic_rainy, "Mendoza", "Lluvia", "23°C");
        Forecast forecast8 = new Forecast(R.drawable.ic_rainy, "Mendoza", "Lluvia", "22°C");

        forecasts.add(forecast1);
        forecasts.add(forecast2);
        forecasts.add(forecast3);
        forecasts.add(forecast4);
        forecasts.add(forecast5);
        forecasts.add(forecast6);
        forecasts.add(forecast7);
        forecasts.add(forecast8);
        forecasts.add(forecast1);
        forecasts.add(forecast2);
        forecasts.add(forecast3);
        forecasts.add(forecast4);
        forecasts.add(forecast5);
        forecasts.add(forecast6);
        forecasts.add(forecast7);
        forecasts.add(forecast8);

        return forecasts;
    }
}
