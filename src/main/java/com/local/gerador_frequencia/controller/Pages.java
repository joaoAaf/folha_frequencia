package com.local.gerador_frequencia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.local.gerador_frequencia.model.entities.Data;

@Controller
public class Pages {
    
    @GetMapping("/")
    public String getHome0() {
        return "home";
    }
    
    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @GetMapping("/register")
    public String getRegister(final Model model) {
        model.addAttribute("data", new Data());
        return "register";
    }

    @PostMapping("/frequency")
    public String getFrequency (@ModelAttribute Data data) {
        return "frequency";
    }

}
