package com.zenika.training.part3.objectsdemo;

public class CarExample {

  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car("ferrari");
    Car car3 = new Car("honda", "red");

    System.out.println("car2 object's brand " + car2.brand);
    System.out.printf("car3 object's brand %s car3 objects's color %s \n", car3.brand, car3.color);
    System.out.println(Car.nbOfCar);

  }
}
