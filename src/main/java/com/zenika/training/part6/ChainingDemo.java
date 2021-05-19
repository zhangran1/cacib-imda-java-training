package com.zenika.training.part6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ChainingDemo {

  public static void main(String[] args) {
    String fileName = "./src/main/java/com/zenika/training/io/person.txt";
    countNbLine(fileName);
  }

  public static void countNbLine(String filename) {
    try (FileReader reader = new FileReader(filename);
        LineNumberReader lineReader = new LineNumberReader(reader)) {
      String line = lineReader.readLine();
      while (line != null) {
        // Display the line number and its content
        System.out.println(lineReader.getLineNumber() + ": " + line);
        line = lineReader.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
