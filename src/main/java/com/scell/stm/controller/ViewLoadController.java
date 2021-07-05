package com.scell.stm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewLoadController {

    @GetMapping("/main")
    public String index(Model model){
        System.out.println("여기로 들어오냐 마냐");
        return "view/main";
    }

    @GetMapping("/register")
    public String register(Model model){
        return "register";
    }

    @GetMapping("/member")
    public String member(Model model){
        return "view/member";
    }

    @GetMapping("/resource")
    public String resource(Model model){
        return "view/resource";
    }

    @GetMapping("/gallery")
    public String gallery(Model model){
        return "view/gallery";
    }

    @GetMapping("/board")
    public String board(Model model){
        return "view/board";
    }


}
