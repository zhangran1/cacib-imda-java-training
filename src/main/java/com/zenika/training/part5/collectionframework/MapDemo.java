package com.zenika.training.part5.collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

  public static void main(String[] args) {
    Map demoHashMap = new HashMap();
    demoHashMap.put("honda", new Car("honda"));
    demoHashMap.put("ferrari", new Car("ferrari"));
    demoHashMap.put("toyota", new Car("toyota"));

    System.out.println("Demo Hash Map size : " + demoHashMap.size());
    System.out.println(demoHashMap);


    Map demoTreeMap = new TreeMap();
    demoTreeMap.put("honda", new Car("honda"));
    demoTreeMap.put("ferrari", new Car("ferrari"));
    demoTreeMap.put("toyota", new Car("toyota"));

    System.out.println(demoTreeMap);


  }

}
