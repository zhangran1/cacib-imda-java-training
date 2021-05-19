package com.zenika.training.part6.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStream {

  public static void main(String[] args) throws IOException {

    File inputFile = new File("./src/main/java/com/zenika/training/part6/zenika.png");
    File outputFile = new File("./src/main/java/com/zenika/training/part6/zenika_out.png");

    File outputStreamFile = new File("./src/main/java/com/zenika/training/part6/zenika_out_stream.png");
    FileInputStream fileInputStream= new FileInputStream(inputFile);
    FileOutputStream fileOutputStream = new FileOutputStream(outputStreamFile);
    FileReader in = new FileReader(inputFile);
    FileWriter out = new FileWriter(outputFile);

    int c;
    while ((c = in.read()) != -1){
      out.write(c);
    }
    in.close();
    out.close();

    int c2;
    while ((c2 = fileInputStream.read()) != -1){
      fileOutputStream.write(c2);
    }
    fileInputStream.close();
    fileOutputStream.close();

  }

}
