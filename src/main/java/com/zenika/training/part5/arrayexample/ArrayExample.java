package com.zenika.training.part5.arrayexample;

public class ArrayExample {

  private static Car[] cars = new Car[10];  //start with 0

  public static void main(String[] args) {
    System.out.println(cars.length);

    Car fourthCar = cars[3];        // retrieve the 4th car from the array
    System.out.println(fourthCar);
    cars[5] = new Car("Toyota");  //Store card in the 1st card
    System.out.println(cars[5].brand);


    for (int index=0; index < cars.length; index++) {
      Car forLoopCarObject = cars[index];
      System.out.println(forLoopCarObject);
    }

//    for(Car car: cars){
//      System.out.println(car);
//    }

  }

}
