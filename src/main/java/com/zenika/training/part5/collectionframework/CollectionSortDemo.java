package com.zenika.training.part5.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {

  public static void main(String[] args) {
    ArrayList<String> arrayListDemo= new ArrayList<>();
    arrayListDemo.add("Zenika");
    arrayListDemo.add("Training");
    arrayListDemo.add("Course");

    System.out.println("List record: :\n" + arrayListDemo);

    Collections.sort(arrayListDemo);

    System.out.println("List after the use of" +
        " Collection.sort() :\n" + arrayListDemo);
  }

}
