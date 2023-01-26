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
    int i1 = 1;
    int i2 = 1;
    int i3 = 1;
    int i4 = 1;
    int i5 = 1;
    int i6 = 2;

    Car bobsCar = new Car();
    bobsCar.color = "red";

    Car aliceCar = new Car();
    aliceCar.color = "red";

    String s0 = "s";
    String s1 = "s";
    String s2 = "s";
    String s3 = "s";

    s0 = s0 + "e"; //se

    String name1 = new String("Alice");
    String name2 = new String("Alic" + "e");
    String name3 = name2;

//    System.out.println(i1 == i2);
//    System.out.println(bobsCar.equals(aliceCar));
//    System.out.println(name1.equals(name2));
//    System.out.println(name1 == name2);
//    System.out.println(name2 == name3);
//
//    System.out.println(s0.equals(s1));
//    System.out.println(s2 == s3);
//    System.out.println(name1 == name2);
//    System.out.println(name1.equals(name2));

    HeavyTruck ht1 = new HeavyTruck();
    HeavyTruck ht2 = new HeavyTruck();

    ht1.color = "blue";
    ht2.color = "blue";

//    System.out.println(ht1.equals(ht2));

    Object o = new Object();
    System.out.println(ht1);
  }

  public static void paintCar(Car car, String carColor) {
    car.color = carColor;
  }

  public static void smth(int i) {
    i = i + 10;
    System.out.println(i);
  }
}
