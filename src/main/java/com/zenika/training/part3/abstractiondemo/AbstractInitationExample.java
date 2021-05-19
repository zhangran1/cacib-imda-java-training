package com.zenika.training.part3.abstractiondemo;

public class AbstractInitationExample {

  public static void main(String[] args) {

    //Animal animal = new Animal(); // Incorrect: Animal is abstract
    Cat cat = new Cat();
    cat.race = "maineCoon";
    cat.gender = "female";
    cat.name = "kitty";
    cat.move();

    Dog dog = new Dog();
    dog.move();

  }

}
