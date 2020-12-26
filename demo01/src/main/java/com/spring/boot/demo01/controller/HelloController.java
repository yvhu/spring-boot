package com.spring.boot.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/boot/hello")
    public @ResponseBody  String hello(){
        return "Hello，Spring Boot。";
    }
}
