package com.qihui.designpattern.observer;

public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private Subject weatherSubject;

    public CurrentConditionsDisplay(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.attach(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
