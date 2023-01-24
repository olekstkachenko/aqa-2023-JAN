package org.prog.poly;

public class Squirrel implements IAnimal {
  @Override
  public void speak() {
    System.out.println("Squirrel sounds");
  }

  public void goesForNuts() {
    goesForNuts("Forest");
  }

  public void goesForNuts(String place) {
    goesForNuts(place, "any nuts");
  }

  public void goesForNuts(String place, String specificNut) {
    System.out.println(place + " " + specificNut);
  }
}
