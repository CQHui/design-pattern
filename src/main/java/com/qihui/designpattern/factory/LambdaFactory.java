package com.qihui.designpattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class LambdaFactory {

    final static Map<String, Supplier<Car>> map = new HashMap<>();

    static {
        map.put("GEELY", Geely::new);
        map.put("BYD", Byd::new);
    }

    public Car getCar(String carName) {
        Supplier<Car> car = map.get(carName.toUpperCase());
        if (car != null) {
            return car.get();
        }
        throw new IllegalArgumentException("no cat named" + carName);
    }


    public static void main(String[] args) {
        Supplier<LambdaFactory> factory = LambdaFactory :: new;
        factory.get().getCar("geely").run();
        factory.get().getCar("byd").run();
    }
}

