package com.iesp.aula1.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld {

    @RequestMapping("/hworld")
    public String HWorld() {
        return "Olá mundo!";
    }
}
