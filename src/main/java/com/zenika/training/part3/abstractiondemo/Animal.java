package com.zenika.training.part3.abstractiondemo;

public abstract class Animal {
  private int age;
  String race;
  String gender;
  abstract void move();
//  private abstract void invalidMethod();  // this method is invalid, abstract method should not be private
}
