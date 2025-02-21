package com.demo.SpringDemoApp.controller;

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

}
