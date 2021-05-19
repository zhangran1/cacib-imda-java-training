package com.zenika.training.part5.arrayexample;

public class Car {

//  static int nbOfCar;
  String brand;

  //Public constructor
  public Car(String brand) {
    this.brand = brand;
//    Car.nbOfCar++;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Car)) {
      return false;
    }

    Car car = (Car) o;

    return brand.equals(car.brand);
  }

  @Override
  public int hashCode() {
    return brand.hashCode();
  }
}
