package com.demo.SpringDemoApp.controller;

import com.demo.SpringDemoApp.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Controller {
    @GetMapping
    public String sayHello(){
        return "Hello From BridgeLabz!";
    }
    @RequestMapping (value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name + "!";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + "!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }
    @PostMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + "!";
    }

}
