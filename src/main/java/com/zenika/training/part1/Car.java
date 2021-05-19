package com.zenika.training.part1;

public class Car {

  public Car() {
  }

  public void saySomething() {   // Will be stored in Stack
    String localVariable = "This variable will be stored in Stack";
  }

}

class Demo{

  Car car = new Car();  // will be stored in Heap

}
