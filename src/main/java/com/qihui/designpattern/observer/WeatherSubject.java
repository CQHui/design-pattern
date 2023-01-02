package com.qihui.designpattern.observer;

public class WeatherSubject extends Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
