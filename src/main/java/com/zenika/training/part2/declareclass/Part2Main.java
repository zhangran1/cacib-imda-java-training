package com.zenika.training.part2.declareclass;

import com.zenika.training.part2.declareclass.vehicles.Car;

public class Part2Main {

  public static void main(String[] args) {
    Car car = new Car();
    car.move(10);
    System.out.println("Current Mileage " +  car.getMileage());
    car.move(10);
    System.out.println("Current Mileage " +  car.getMileage());
  }
}
