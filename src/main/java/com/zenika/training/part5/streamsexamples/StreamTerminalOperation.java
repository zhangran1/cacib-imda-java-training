package com.zenika.training.part5.streamsexamples;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminalOperation {

  public static void main(String[] args) {
    Stream demoStream = Stream.of("ab", "cde");
    demoStream.forEach(System.out::println);
    System.out.println(demoStream);
    long itemCount = Stream.of("ab", "cde").count();
    System.out.println("stream item count: " + itemCount);

    IntStream numbers = IntStream.of(2, 8, 4);
    OptionalInt minimum = numbers.min();
    System.out.println("Minimum value is: " + minimum.getAsInt());
    System.out.println(numbers.findAny());

  }

}
