package org.prog;

public class Car {

  public String color;

  public void drive(String city) {
    System.out.println("Car goes brrrr");
    startEngine();
    setGear();
    pressAcceleration();
    System.out.println(city);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Car) {
      return ((Car) obj).color.equals(this.color);
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "This car is " + this.color;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  private void startEngine() {

  }

  private void setGear() {

  }

  private void pressAcceleration() {

  }
}
