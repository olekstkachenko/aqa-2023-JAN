package org.prog;

public class Main {

  /**
   * ###############################
   * ########inc####################
   * ##########inc_2#################
   * ###############################
   * ########inc_3################
   * ###############################
   *
   * @param args
   */

  public static void main(String... args) {
//    int i = 10;
//    smth(i);
//    System.out.println(i);


    Car bobsCar = new Car();
//    Car aliceCar = new Car();
//    Car thatCar = bobsCar;
//
//    paintCar(bobsCar, "red");
//    System.out.println(bobsCar.color);
//
//    paintCar(aliceCar, "blue");
//    System.out.println(aliceCar.color);
//
//    paintCar(thatCar, "yellow");
//    System.out.println(thatCar.color);
//    System.out.println("Bobs car is now " + bobsCar.color);


    bobsCar.drive("Zhytomyr");

    Truck truck = new Truck();
    truck.drive("Lviv");
    truck.color = "black";

    truck.addCargo();
    HeavyTruck heavyTruck = new HeavyTruck();
    heavyTruck.addCargo();
    heavyTruck.drive("Kyiv");

    Tesla tesla = new Tesla();
    tesla.drive("Lutsk");
  }

  public static void paintCar(Car car, String carColor) {
    car.color = carColor;
  }

  public static void smth(int i) {
    i = i + 10;
    System.out.println(i);
  }
}
