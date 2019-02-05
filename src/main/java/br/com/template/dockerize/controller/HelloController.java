package br.com.template.dockerize.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping(value="/hello")
    public String requestMethodName(@RequestParam String name) {
        return new String("Welcome: " + name);
    }
}