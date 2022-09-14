package com.sprideron.controllers;

import com.sprideron.models.Users;
import com.sprideron.services.impl.EntityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class EntityController {
    @Autowired
    private EntityServiceImpl entityService;

    @PostMapping("/users")
    public Users addUser(@RequestBody Users user){
        System.out.println("visited");
        return entityService.saveUser(user);
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return entityService.getUsers();
    }

    @GetMapping("/")
    public String getHello(){
        return "Hello";
    }
}
