package com.demo.task;

import com.demo.bean.Weather;
import com.demo.bean.WeatherStationOne;
import com.demo.bean.WeatherStationTwo;
import com.demo.service.WeatherForecastService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Author: Administrator
 * @Date: 2023/2/14
 * @Description: com.demo.task
 */
@Component
public class WeatherReportTask implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        Weather weather = new Weather();

        WeatherStationOne weatherStationOne = new WeatherStationOne(weather);
        WeatherStationTwo weatherStationTwo = new WeatherStationTwo(weather);

        final long time = 60000;
        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {

                    float temperature = 0 + new Random().nextFloat() * (40 - 0);
                    float humidity = 0 + new Random().nextFloat() * (100 - 0);
                    float pressure = 0 + new Random().nextFloat() * (100 - 0);

                    // mock weather data
                    weather.weatherUpdate(temperature, humidity, pressure, true);
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
