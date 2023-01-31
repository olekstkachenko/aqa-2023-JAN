package org.prog.collections;

import org.prog.Car;

import java.io.File;
import java.util.HashMap;

public class MapDemo {

    public static void main(String... args) {
        Car carOne = new Car();
        Car carTwo = new Car();
        Car carThree = new Car();
        File file = new File("");
        Object o = new Object();
        Integer i = 1;
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<Car, String> carsMap = new HashMap<>();

        hashMap.put("b", file);
        hashMap.put("c", o);
        hashMap.put("d", i);

        carsMap.put(carOne, "Bob");
        carsMap.put(carTwo, "Alice");
        carsMap.put(carThree, "Bob");

        System.out.println(hashMap.get("a"));
        hashMap.put(null, "this is null key");
        hashMap.put("null", null);
        System.out.println(hashMap.get(null).toString());
        hashMap.entrySet().stream()
                .forEach(entry -> {
                    System.out.println("entry key " + entry.getKey());
                    System.out.println("entry value " + entry.getValue());
                });
        hashMap.size();
    }
}
