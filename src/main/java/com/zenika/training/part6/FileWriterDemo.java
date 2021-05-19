package com.zenika.training.part6;

import com.zenika.training.part3.inheritancedemo.Person;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

  public static void main(String[] args) throws IOException {
    FileWriter fw = null;
    fw = new FileWriter("/home/zhangran/workspace/IMDA-CACIB-2021-experimental/src/main/java/com/zenika/training/io/person.txt");
    BufferedWriter out = new BufferedWriter(fw);

    try {
      Person person1 = new Person("DALTON", "Joe");
      Person person2 = new Person("DALTON", "Joe");


      out.write(person1.getFirstName() + "," + person1.getLastName());
      out.newLine();
      out.write(person2.getFirstName() + "," + person2.getLastName());
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
