package com.zenika.training.part5.objectidentityandarrays;

public class Cat {

//  static int nbOfCar;
  String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Cat)) {
      return false;
    }

    Cat cat = (Cat) o;

    return name.equals(cat.name);
  }

  @Override
  public int hashCode() {
    return 100;
  }
}
