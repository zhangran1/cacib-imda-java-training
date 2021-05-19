package com.zenika.training.part5.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    hashSet.add("item1");
    hashSet.add("item2");
    hashSet.add("item3");
    hashSet.add("item4");
    hashSet.add("item5");
    hashSet.add("item1"); //item will not be added
    System.out.println(hashSet);

    Set<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("item3");
    linkedHashSet.add("item4");
    linkedHashSet.add("item1");
    linkedHashSet.add("item2");
    linkedHashSet.add("item5");
    linkedHashSet.add("item1"); //item will not be added
    System.out.println(linkedHashSet);

    Set<String> treeSet = new TreeSet<>();
    treeSet.add("item3");
    treeSet.add("item1");
    treeSet.add("item2");
    treeSet.add("item4");
    treeSet.add("item1"); // item will not be added
    System.out.println(treeSet);
  }

}
