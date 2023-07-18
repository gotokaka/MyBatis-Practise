package com.example.MyBatis.entity;

public class Name {

  private int id;
  private String name;


  public Name(int id, String name) {
    this.id = id;
    this.name = name;
  }


  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
}
