package org.prog.err;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

  static String s;

  public static void main(String[] args) {
    try {
      FileReader fileReader = new FileReader("asd.asd");
      smth1();
      compare();
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception!");
    } catch (Exception e) {
      System.out.println("Ooops!");
    }

    try {

    } finally {

    }

    try {
      smth1();
    } catch (Exception e) {

    } finally {

    }
  }

  public static void smth1() throws Exception {
    smth2();
  }

  public static void smth2() throws Exception {
    smth3();
  }

  public static void smth3() throws Exception {
    smth4();
  }

  public static void smth4() throws Exception {
    throw new Exception();
  }

  public static void compare() {
    System.out.println(s.equals("a"));
  }
}
