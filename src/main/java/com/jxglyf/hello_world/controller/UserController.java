package com.jxglyf.hello_world.controller;

import com.jxglyf.hello_world.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @ApiOperation("Get the user")
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id) {
        System.out.println(id);
        return "Get the user information by id";
    }

    @PostMapping("/user")
    public String save(User user) {
        return "Add the user";
    }

    @PutMapping("/user")
    public String update(User user){
        return "Update the user";
    }

    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable int id) {
        System.out.println(id);
        return "Delete the user by id";
    }
}
