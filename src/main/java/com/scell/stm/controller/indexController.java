package com.scell.stm.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class indexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
