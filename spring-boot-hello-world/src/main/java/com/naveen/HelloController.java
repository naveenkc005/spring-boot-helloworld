package com.naveen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot! Naveen suriya";
    }
    @RequestMapping("/teja/")
  public  String  teja(){

      return "teja";
  }


}