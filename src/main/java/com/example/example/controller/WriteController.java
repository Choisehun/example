package com.example.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/example")
public class WriteController {

    @GetMapping("/write")
    public String writer() {
       return "thymeleaf/write";
    }
    @PostMapping("/write")

    public String write(){
        return null;
    }

}
