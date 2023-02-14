package com.demo.bean;

import com.demo.core.Observer;

/**
 * @Author: Administrator
 * @Date: 2023/2/14
 * @Description: com.demo.bean
 */
public class WeatherStationTwo implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    private String name = "WeatherStationTwo";

    private Weather weather;

    public WeatherStationTwo(Weather weather) {
        this.weather = weather;
        weather.register(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        recordWeather();
    }

    private void recordWeather() {
        System.out.println(getName() + " record temperature:" + String.format("%.2f", temperature));
        System.out.println(getName() + " record humidity:" + String.format("%.2f", humidity));
        System.out.println(getName() + " record presure:" + String.format("%.2f", pressure));
    }

    public void removeObserver() {
        weather.remove(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
