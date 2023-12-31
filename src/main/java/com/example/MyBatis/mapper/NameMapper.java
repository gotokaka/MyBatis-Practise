package com.example.MyBatis.mapper;

import com.example.MyBatis.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
  @Select("SELECT * FROM names")
  List<Name> findAll();

}
