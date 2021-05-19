package com.zenika.training.part5.streamsexamples;

import java.util.Random;
import java.util.stream.Stream;

public class StreamUnlimitedStream {

  public static void main(String[] args) {
//    Stream finiteStream = Stream.of("a", "b");
//    finiteStream.forEach(System.out::println);
    Stream streamGen = Stream.generate(new Random()::nextDouble); // Infinitestream
    streamGen.forEach(System.out::println);

  }

}
