package com.zenika.training.part4;

import java.io.IOException;

public class CheckedExceptionDemo {

  //Checked exception are exceptions sub class of Exception class
  public static void main(String[] args) {
    try {
      for (int i = 0; i < 5; i++) {
        if (i == 2) {
          throw new IOException();
        }
        System.out.println("i value = " + i);
      }
    } catch (IOException e) {
      System.out.println(e.getStackTrace());
    } finally {
      System.out.println("Enter final state");
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("i value from second loop = " + i);
    }




  }
}
