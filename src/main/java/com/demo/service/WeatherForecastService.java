package com.demo.service;

import com.demo.bean.Weather;

/**
 * @Author: Administrator
 * @Date: 2023/2/14
 * @Description: com.demo.service
 */
public interface WeatherForecastService {

    public void setWeather(Weather weather);
    public void report();
}
