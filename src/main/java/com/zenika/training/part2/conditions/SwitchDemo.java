package com.zenika.training.part2.conditions;

public class SwitchDemo {

  public static void main(String[] args) {
    String day = null;
    int workDayNumber = 8;
    switch( workDayNumber ) {
      case 1: day = "Monday";
        break;
      case 2: day = "Tuesday";
        break;
      case 3: day = "Wednesday";
        break;
      case 4: day = "Thursday";
        break;
      case 5: day = "Friday";
        break;
      default:
        day = "not a work day number";
    }
  }

}
