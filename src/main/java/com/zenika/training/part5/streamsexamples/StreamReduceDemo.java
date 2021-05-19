package com.zenika.training.part5.streamsexamples;

import java.util.stream.Stream;

public class StreamReduceDemo {

  public static void main(String[] args) {
    Stream test = Stream.of("Chain", "of", "text");

    String initialIdentity = "";
    String concatenation = Stream.of("Chain", "of", "text")
        .reduce(initialIdentity, (accumulator, currentItem) -> accumulator + " " +  currentItem);

    System.out.println(concatenation);
  }

}
