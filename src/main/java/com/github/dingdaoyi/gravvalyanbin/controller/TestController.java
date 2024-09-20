package com.github.dingdaoyi.gravvalyanbin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class TestController {
    @GetMapping
    public String ping(){
        return "ping";
    }
}
