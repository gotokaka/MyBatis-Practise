package com.example.MyBatis;

public class AnimalName {
  private int id;

  public int getId() {
    return id;
  }

  public AnimalName(int id) {
    this.id = id;
  }

  private String AnimalNames;

  public String getAnimalNames() {
    return AnimalNames;
  }

  public AnimalName(String animalNames) {
    AnimalNames = animalNames;
  }
}
