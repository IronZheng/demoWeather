package com.demo.service;

import com.demo.bean.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Administrator
 * @Date: 2023/2/14
 * @Description: com.demo.core
 */
@Service
public class WeatherForecastServiceimpl implements WeatherForecastService{

    private Weather weather;

    @Override
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void report() {

    }
}
