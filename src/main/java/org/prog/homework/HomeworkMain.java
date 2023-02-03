package org.prog.homework;

public class HomeworkMain {

    public static void main(String... args) {
        Plane plane1 = new Plane("A001", "New York");
        Plane plane2 = new Plane("B002", "London");
        Plane plane3 = new Plane("C003", "Paris");
        
        Airport.planes.add(plane1);
        Airport.planes.add(plane2);
        Airport.planes.add(plane3);
    }
}
