package com.zenika.training.part6.fileobject;

import java.io.File;

public class FIleObjectDemo {
  public static void main(String[] args) {

    File file = new File("./src/main/java/com/zenika/training/part6/person.txt");
    boolean theFileExists = file.exists();
    System.out.println(theFileExists);


  }
}
