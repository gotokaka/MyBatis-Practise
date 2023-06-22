package com.example.MyBatis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalNameController {
  private final AnimalNameMapper animalNameMapper;

  public AnimalNameController(AnimalNameMapper animalNameMapper) {
    this.animalNameMapper = animalNameMapper;
  }

  @GetMapping("/animals")
  public  List<AnimalName> getAnimalNames() {
    return animalNameMapper.findAll();
  }

}
