package com.jxglyf.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://localhost:8080/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET) //== @GetMapping("/hello")
    // query string: http://localhost:80/hello?nickname=zhangsan&phone=123 String nickname, String phone
    public String hello(String nickname, String phone){
        System.out.println(phone);
        return "Hello World Spring Boot! " + nickname + " Phone" + phone;
    }

    // query string: http://localhost:80/hello?nickname=zhangsan

}
