package com.qihui.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();

        // 创建当前状况布告板
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherSubject);

        // 模拟新的天气测量值
        weatherSubject.setMeasurements(80, 65, 30.4f);
        weatherSubject.setMeasurements(82, 70, 29.2f);
        weatherSubject.setMeasurements(78, 90, 29.2f);
    }
}
