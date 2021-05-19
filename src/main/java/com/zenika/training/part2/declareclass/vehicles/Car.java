package com.zenika.training.part2.declareclass.vehicles;

import com.zenika.training.part2.declareclass.operators.Driver;

public class Car {
  // fields
  int nbOfKilometers;
  Driver driver;

  // methods
  public void start() {                  // Does not return any value
    System.out.println("enter start method");
  }
  public void move(int distance) {
    start();                    // call the method start
    nbOfKilometers += distance; // Modify the field nbOfKilometers value
  }
  public int getMileage() {
    return nbOfKilometers;      // Return the field nbOfKilometers value
  }
}
