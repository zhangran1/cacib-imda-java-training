package com.zenika.training.part3.inheritancedemo;

public class Teenager extends Person {

  public Teenager(String firstName, String lastName) {
    super(firstName, lastName);
  }

  @Override
  public String getFirstName() {
    return super.getFirstName();
  }

  @Override
  public void setFirstName(String firstName) {
    super.setFirstName(firstName);
  }

  @Override
  public String getLastName() {
    return super.getLastName();
  }

  @Override
  public void setLastName(String lastName) {
    super.setLastName(lastName);
  }

  @Override
  void throwAParty() {
    super.throwAParty();
  }
}
