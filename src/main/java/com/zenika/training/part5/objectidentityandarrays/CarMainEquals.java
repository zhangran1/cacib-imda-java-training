package com.zenika.training.part5.objectidentityandarrays;

public class CarMainEquals {

  public static void main(String[] args) {

    //Physical identity compares the memory address

    Car car1 = new Car("Ferrari");
    Car car2 = car1;
    System.out.println("Car 1 Memory Address " + car1);
    System.out.println("Car 2 Memory Address " + car2);
    System.out.println("Car 1 equals to Car 2 compare by memory address = " + (car2 == car1));  // This line compare memory address


//    Car car3 = new Car("honda");
//    Car car4 = new Car("honda");
//    System.out.println("Car 3 Memory Address " + car3);
//    System.out.println("Car 4 Memory Address " + car4);
//    System.out.println("Car 3 equals to Car 4 compare by memory address = " + (car3==car4));
//    System.out.println("Car 3 equals to Car 4 compare by logical identity = " + car3.equals(car4));
//    System.out.println(car3.hashCode());
//    System.out.println(car4.hashCode());
//    System.out.println(car1.equals(car3));
//
//
//    Cat cat = new Cat("robot cat");
//
//    System.out.println(cat.hashCode());
//    System.out.println(car3.equals(cat));

    //1. two equal instance always result in the same hashcode
    //2. two instances has same hascode not necessary mean they are equal.

  }

}
