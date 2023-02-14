package com.demo.test;

import com.demo.bean.Weather;
import com.demo.bean.WeatherStationOne;
import com.demo.bean.WeatherStationTwo;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: Administrator
 * @Date: 2023/2/14
 * @Description: com.demo.test
 */
public class TestUtils {

    @Test
    public void testObserver(){
        Weather weather = new Weather();
        WeatherStationTwo weatherStationTwo = new WeatherStationTwo(weather);
        WeatherStationOne weatherStationOne = new WeatherStationOne(weather);
        System.out.println("========");

        // mock weather update ,notify all station
        weather.weatherUpdate(11,22,12,true);
        System.out.println("========");

        // remove station ,mock weather update ,notify all station
        weather.remove(weatherStationTwo);
        weather.weatherUpdate(11,22,12,true);
        System.out.println("========");

        // add new station
        WeatherStationTwo weatherStationTwo2 = new WeatherStationTwo(weather);
        weather.weatherUpdate(11,22,12,true);
        System.out.println("========");

        // set not notify all station
        weather.weatherUpdate(11,22,12,false);
        System.out.println("========");
    }

}
