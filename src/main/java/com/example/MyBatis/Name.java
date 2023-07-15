package com.example.MyBatis;

public class Name {

  private String name;

  private int id;


  public Name(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
  //デフォルトコンストラクタが必要だったようです。これがないと上手くレスポンスできませんでした。
  public Name() {
  }
}
