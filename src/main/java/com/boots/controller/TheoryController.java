package com.boots.controller;

import com.boots.service.TheoryService;
import com.boots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TheoryController {

    @Autowired
    private TheoryService theoryService;

    @GetMapping("/theory")
    public String theoryList(Model model) {
        model.addAttribute("allTheory", theoryService.allTheory());
        return "theory";
    }
    @PostMapping("/theory")
    public String  theory(  Model model) {

        return "theory";
    }

}
