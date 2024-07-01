package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/bsm")
    public String bsm() {
        return "mentalidade de crescimento,"
                + "responsabilidade pessoal,"
                + "orientação ao futuro,"
                + "persistência,"
                + "comunicação,"
                + "proatividade,"
                + "orientação aos detalhes,"
                + "trabalho em equipe";
    }

    @GetMapping("/objetivo")
    public String objetivo() {
        return "obter conhecimento de SPRING";
    }
}