package com.zenika.training.part2.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {

  public static void main(String[] args) {
    List<String> items = Arrays.asList("Item1", "Item2", "Item3", "Item4");

    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };

    /*
    Consumer<String> consumer = (String s) -> System.out.println(s);

    // same as

    Consumer<String> consumer =  s-> System.out.println(s);
    */

    items.forEach(consumer);

    items.forEach(s -> System.out.println(s));

    //pass a function to a function

    //:: to indicate println is a function
    // Need to indicate the class
    items.forEach(System.out::println);

  }

}
