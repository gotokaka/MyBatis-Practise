package com.example.MyBatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnimalNameMapper {
  @Select("SELECT * FROM animals")
  List<AnimalName> findAll();

}
