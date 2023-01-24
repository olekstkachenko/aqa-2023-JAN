package org.prog.incaps;

public class Incapsulation {

  public String pubString;
  protected String protString;
  private String privString;


  public void smth(String arg) {
    smthPriv(arg);
  }

  private void smthPriv(String s) {
    privString = s;
  }

  public void compare(String value) {
    System.out.println(privString.equals(value));
  }
}
