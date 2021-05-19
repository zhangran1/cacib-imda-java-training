package com.zenika.training.part6.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExampleJava7 {

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new
        FileReader("./src/main/java/com/zenika/training/part6/person.txt"))) {

      String line = reader.readLine();

    } catch (IOException e) {
      throw new RuntimeException("stream processing error", e);
    }
  }

}
