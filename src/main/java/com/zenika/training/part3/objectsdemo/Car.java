package com.zenika.training.part3.objectsdemo;

public class Car {
  String brand;
  String color;
  static int nbOfCar;
  public Car() {
    this.nbOfCar++;
  }
  // Default constructor
  public Car(String theBrand) { // Other constructor
    brand = theBrand;
    this.nbOfCar++;
  }

  public Car(String theBrand, String colorCar) { // Other constructor
    brand = theBrand;
    color = colorCar;
    this.nbOfCar++;
  }
}

