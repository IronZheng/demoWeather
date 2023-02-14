package com.demo.bean;

import com.demo.core.Observer;
import com.demo.core.Subject;

import java.util.ArrayList;

/**
 * @Author: Administrator
 * @Date: 2023/2/14
 * @Description: com.demo.bean
 */
public class Weather implements Subject {

    private ArrayList<Observer> observersList = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;


    public void register(Observer observer) {
        System.out.println("regist station:" + observer.getName());
        observersList.add(observer);
    }

    public void remove(Observer observer) {

        for (Observer o : observersList) {
            if (o == observer) {
                observersList.remove(o);
            }
        }
    }


    public void notifyAllObserver() {
        for (Observer o : observersList) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void weatherUpdate() {
        notifyAllObserver();
    }

    public void weatherUpdate(float temperature, float humidity, float pressure, boolean needNotify) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        if (needNotify) {
            weatherUpdate();
        }
    }



}
