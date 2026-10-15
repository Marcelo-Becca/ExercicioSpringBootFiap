package br.com.saldocerto.produtos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping
    public String HelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/fiap")
    public String fiap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = s.nextLine();
        return nome;
    }
}
