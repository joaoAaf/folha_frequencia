package com.local.gerador_frequencia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pages {
    
    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

}
