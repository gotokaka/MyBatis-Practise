package com.example.MyBatis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

  //Controller -> Service -> Mapperの順で処理を行う。

  private final NameService nameService;

  public NameController(NameService nameService) {
    this.nameService = nameService;
  }

  @GetMapping("/names")
  public List<NameResponse> names() {
    List<Name> names = nameService.findAll();
    List<NameResponse> response = names.stream().map(name -> new NameResponse(name)).toList();
    return response;
  }
}
