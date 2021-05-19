package com.zenika.training.part5.collectionframework;

public class Car {

  String brand;

  //Public constructor
  public Car(String brand) {
    this.brand = brand;
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

    return this.brand.equals(car.brand);
  }

  @Override
  public int hashCode() {
//    return 100;
    return brand.hashCode();
  }
}
