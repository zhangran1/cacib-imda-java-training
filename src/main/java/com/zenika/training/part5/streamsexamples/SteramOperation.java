package com.zenika.training.part5.streamsexamples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteramOperation {

  public static void main(String[] args) {

   // Display the elements before and after the transformation


    List strings = Stream.of("One", "Two", "Three", "Four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Before: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("After: " + e))
        .collect(Collectors.toList());

    System.out.println(strings);

  }
}
