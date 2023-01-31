package org.prog.collections;

import org.prog.Car;
import org.prog.Owner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionsPractice {

    public static void main(String... args) {
        Owner ownerOne = new Owner();
        ownerOne.name = "Bob";
        ownerOne.phone = "123456";

        Owner ownerTwo = new Owner();
        ownerTwo.name = "Alice";
        ownerTwo.phone = "654321";

        Car carOne = new Car();
        carOne.color = "red";
        carOne.planeNumber = "GG0000TT";
        carOne.owner = ownerOne;

        Car carTwo = new Car();
        carTwo.color = "blue";
        carTwo.planeNumber = "KK9999FF";
        carTwo.owner = ownerOne;

        Car carThree = new Car();
        carThree.color = "red";
        carThree.planeNumber = "JJ6785OO";
        carThree.owner = ownerTwo;

        List<Car> carsOnTheStreet = new ArrayList<>();
        carsOnTheStreet.add(carOne);
        carsOnTheStreet.add(carTwo);
        carsOnTheStreet.add(carThree);

        boolean bobHasRedCar = carsOnTheStreet.stream()
                .filter(c -> c.color.equals("red"))
                .filter(c -> c.owner.name.equals("Bob"))
                .findAny().isPresent();
        System.out.println(bobHasRedCar);

        String unknownPhone = carsOnTheStreet.stream()
                .filter(c -> !c.owner.name.equals("Bob"))
                .filter(c -> c.planeNumber.equals("JJ6785OO"))
                .map(c -> c.owner.phone)
                .findAny().get();

        System.out.println(unknownPhone);

        HashMap<Owner, Car> ownedCars = new HashMap<>();
        ownedCars.put(ownerOne, carOne);
        ownedCars.put(ownerTwo, carOne);

    }
}
