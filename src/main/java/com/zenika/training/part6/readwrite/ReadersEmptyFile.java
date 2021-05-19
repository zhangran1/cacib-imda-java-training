package com.zenika.training.part6.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadersEmptyFile {

  public static void main(String[] args) {

    try {
      FileReader fileReader = new FileReader("./src/main/java/com/zenika/training/part6/empty.txt");
      System.out.println(fileReader.read());

    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
  }

}
