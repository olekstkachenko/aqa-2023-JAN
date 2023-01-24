package org.prog.poly;

public class PolyDemo {

  public static void main(String... args) {
    Dog dog = new Dog();
    Duck duck = new Duck();
    Squirrel squirrel = new Squirrel();

//    speaking(dog);
//    speaking(duck);
//    speaking(squirrel);

    squirrel.goesForNuts();
    squirrel.goesForNuts("Park");
    squirrel.goesForNuts("Park", "specific nuts");
  }

  public static void speaking(IAnimal animal) {
    animal.speak();
  }
}
