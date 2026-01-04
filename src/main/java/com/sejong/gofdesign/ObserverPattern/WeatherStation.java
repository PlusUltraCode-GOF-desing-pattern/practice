package com.sejong.gofdesign.ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);


        weatherData.setMeasurements(10,10,10);
        weatherData.setMeasurements(12,12,12);
        currentDisplay2.update(1,1,1);
    }
}
