package com.scell.stm.controller;

import com.scell.stm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewLoadController {

    @Autowired
    UserDao userDao;

    @GetMapping("/main")
    public String index(Model model){
        return "view/main";
    }

    @GetMapping("/register")
    public String register(Model model){
        return "register";
    }

    @GetMapping("/member")
    public String member(Model model){
        model.addAttribute("member", userDao.selectUser());
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
