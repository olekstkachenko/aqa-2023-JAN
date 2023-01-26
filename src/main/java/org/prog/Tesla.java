package org.prog;

public class Tesla extends Car {

  @Override
  public void drive(String city) {
    super.drive(city);
    System.out.println("Tesla driver quietly");
  }
}
