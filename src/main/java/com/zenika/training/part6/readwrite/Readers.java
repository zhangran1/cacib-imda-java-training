package com.zenika.training.part6.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readers {

  public static void main(String[] args) {
//    BufferedReader bufferReader = null;
    try {
      FileReader fileReader = new FileReader("./src/main/java/com/zenika/training/part6/person.txt");
//      bufferReader = new BufferedReader(fileReader);
      String line = null;
      int character;
      char currentValue = 0;
//      while ((line = bufferReader.readLine()) != null) {
//        System.out.println(line);
//      }
      while((character = fileReader.read()) != -1) {
        System.out.println("integer value " + character  + " character value " + (char)character);
      }



    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
  }

}
