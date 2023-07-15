package com.example.MyBatis;

public class Name {

  private int id;
  private String name;


  public Name(int id, String name) {
    this.id = id;
    this.name = name;
  }

  //デフォルトコンストラクタが必要だったようです。これがないと上手くレスポンスできませんでした。
  public Name() {
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
}
