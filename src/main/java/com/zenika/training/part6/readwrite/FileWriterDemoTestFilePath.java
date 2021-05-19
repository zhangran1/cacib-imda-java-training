package com.zenika.training.part6.readwrite;

import com.zenika.training.part3.inheritancedemo.Person;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemoTestFilePath {

  public static void main(String[] args) throws IOException {
    FileWriter fw = null;
    fw = new FileWriter("./src/main/java/com/zenika/training/part6/person2.txt");
    BufferedWriter out = new BufferedWriter(fw);

    try {
      Person person1 = new Person("DALTON", "Joe");

      out.write(person1.getFirstName() + "," + person1.getLastName());
      out.newLine();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }

}
