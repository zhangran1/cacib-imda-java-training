package com.zenika.training.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class UncheckedRuntimeExceptionDemo {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3);
    for (int i = 0; i <= 3; i++) {
      System.out.println(list.get(i));
    }
  }

}
