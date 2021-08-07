package com.scell.stm.controller;

import com.scell.stm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ViewLoadController {

    @Autowired
    UserDao userDao;

    @GetMapping("/main")
    public String index(Model model, HttpSession session){
        System.out.println("하1234아");
        model.addAttribute("userInfo", session.getAttribute("userInfo"));
        return "view/main";
    }

    @GetMapping("/register")
    public String register(Model model){
        return "register";
    }

    @GetMapping("dashboard")
    public String dashboard(Model model) {
        return "view/dashboard";
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

    @GetMapping("/resourceManage")
    public String resourceEdit(Model model) {
        return "view/resourceManage";
    }

    @GetMapping("/gallery")
    public String gallery(Model model){
        return "view/gallery";
    }

    @GetMapping("/mypage")
    public String mypage(Model model){
        return "view/mypage";
    }

    @GetMapping("/board")
    public String board(Model model){
        return "view/board";
    }


}
