package com.zenika.training.part2.lambda;

public class InterfaceDemo {

  // Types of Interace
  // 1. Normal Interface
  // 2. Functional Interface - only has one method
  public static void main(String[] args) {

    //Interface implementation
    DemoInterface demoInterface = new DemoInterface() {
      @Override
      public void saySomething() {
        System.out.println("This is a demo interface");
      }
    };

    //Lambda
    DemoInterface demoInterface1 = () -> {
      {
        System.out.println("This is an output from demo interface 1");
      }
    };

    //Concise Lambda
    DemoInterface demoInterface2 = () -> System.out.println("This is an output from demo interface 2");

    ComputeValue computeValue1 = (x, y) -> {
      return x + y;
    };

    ComputeValue computeValue2 = (x, y) -> x + y;

    ComputeValue computeValue3 = (x, y) -> {
      int z = x + y;
      z = z * 2;
      return z;
    };


    demoInterface.saySomething();
    demoInterface1.saySomething();
    demoInterface2.saySomething();
    System.out.println(computeValue1.sum(5, 6));
    System.out.println(computeValue2.sum(2, 3));
    System.out.println(computeValue3.sum(1, 2));
  }

}
