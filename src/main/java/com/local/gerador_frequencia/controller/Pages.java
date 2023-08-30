package com.local.gerador_frequencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.local.gerador_frequencia.model.dto.DataDTO;
import com.local.gerador_frequencia.model.dto.DataJSON;
import com.local.gerador_frequencia.model.entities.Data;
import com.local.gerador_frequencia.model.service.DataService;

@Controller
public class Pages {

    @Autowired
    private DataService dataService;
    
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
        model.addAttribute("dataDto", new DataDTO());
        return "register";
    }

    @PostMapping("/frequency")
    public String getFrequency (@ModelAttribute DataDTO dataDto, final Model model) {
        Data data = dataService.DTOForData(dataDto);
        model.addAttribute("data", data);
        DataJSON json = null;
        if (dataDto.getSalvar()) {
            json = dataService.DTOForJson(dataDto);
        }
        model.addAttribute("json", json);
        return "frequency";
    }

}
