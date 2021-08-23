package com.personalblog.turma29.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping(value="/")
    public String getMethodName0() {
        return "Hello, World. Esta é a minha primeira aplicação utilizando Spring Boot.";
    } 
    @GetMapping(value="/bsm")
    public String getMethodName1() {
        return "Habilidades utilizadas para criar esta aplicação: atenção aos detalhes e proatividade. Mentalidades utilizadas para criar esta aplicação: orientação ao futuro, responsabilidade pessoal, mentalidade de crescimento e persistência.";
    }   
    @GetMapping(value="/goals")
    public String getMethodName2() {
        return "Objetivos de aprendizagem da semana 06: dominar os conceitos e aplicações do Spring Boot.";
    }      
}
