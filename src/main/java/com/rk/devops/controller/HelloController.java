package com.rk.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramakrishna.
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello RK!!";
    }
}
