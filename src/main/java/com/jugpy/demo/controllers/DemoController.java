package com.jugpy.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by william on 1/5/18.
 */
@RestController
public class DemoController {

    @GetMapping(value = "/")
    public String getGreeting(){
        return "Hola Mundo";
    }
}
