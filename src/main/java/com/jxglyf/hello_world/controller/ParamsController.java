package com.jxglyf.hello_world.controller;


import com.jxglyf.hello_world.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParamsController {

    @RequestMapping(value = "/getTest1", method = RequestMethod.GET)
    public String getTest1(){
        return "GET request";
    }

    @RequestMapping(value = "/getTest2", method = RequestMethod.GET)
    // http://localhost:80/getTest2?nickname=xxx&phone=xxx
    public String getTest2(String nickname, String phone){
        System.out.println("nickname:"+nickname);
        System.out.println("phone:"+phone);
        return "GET request";
    }

    @RequestMapping(value = "/getTest3", method = RequestMethod.GET)
    // http://localhost:80/getTest2?nickname=xxx param mapping default required
    public String getTest3(@RequestParam(value = "nickname", required = false) String name){
        System.out.println("nickname:"+name);
        return "GET request";
    }

    @RequestMapping(value = "/postTest1", method = RequestMethod.POST)
    public String postTest1(){
        return "POST request";
    }

    @RequestMapping(value = "/postTest2", method = RequestMethod.POST)
    public String postTest2(String username, String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "POST request";
    }

    @RequestMapping(value = "/postTest3", method = RequestMethod.POST)
    public String postTest3(User user){
        System.out.println("user:"+user);
        return "POST request";
    }

    @RequestMapping(value = "/postTest4", method = RequestMethod.POST)
    public String postTest4(@RequestBody User user){
        System.out.println("user:"+user);
        return "POST request";
    }

    @GetMapping("/test/**")
    public String test(){
        return "** Request";
    }

}
