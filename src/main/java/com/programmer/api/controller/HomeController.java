package com.programmer.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class HomeController {

  @GetMapping
  public String HelloWorld() {
    return "Hello World";
  }

}
