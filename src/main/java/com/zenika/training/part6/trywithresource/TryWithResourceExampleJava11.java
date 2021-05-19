package com.zenika.training.part6.trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExampleJava11 {

  public static void main(String[] args) throws FileNotFoundException {
    BufferedReader reader = new BufferedReader(new
        FileReader("./src/main/java/com/zenika/training/part6/person.txt"));
    try (reader) {
      String line = reader.readLine();
    } catch (IOException e) {
      throw new RuntimeException("stream processing error", e);
    }
  }

}
