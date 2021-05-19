package com.zenika.training.part2.overload;

public class OverLoadMain {
  public final static int DEMO_INT = 5;

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.addUp(2, 3));
    System.out.println(calculator.addUp(5.0f, 5.1f));
    System.out.println(calculator.addUp(1, 2, 3));

  }

}
