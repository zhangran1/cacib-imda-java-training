package com.zenika.training.part5.collectionframework;

import java.util.LinkedList;
import java.util.List;

/**/
public class ListDemo {

  public static List<String> aList = new LinkedList<>();

  public static void main(String[] args) {
    aList.add("item1");
    aList.add("item2");
    aList.add(0, "item0");
    System.out.println(aList.get(0));
  }

}
