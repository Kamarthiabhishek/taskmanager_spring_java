package com.altruist.taskmanager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class DemoController {

    @GetMapping("demo")
    public String demoController(){
        return "Hello world";
    }
}
