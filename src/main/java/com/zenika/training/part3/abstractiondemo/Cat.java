package com.zenika.training.part3.abstractiondemo;

public class Cat extends Animal {
  String name = "";

  @Override
  void move() {
    System.out.println("cat is walking");
  }
}
