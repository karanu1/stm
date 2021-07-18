package com.scell.stm.controller;

import com.scell.stm.KakaoAPI;
import com.scell.stm.dto.UserDto;
import com.scell.stm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;


@Controller
public class KakaoContorller {
    @Autowired
    UserService userService;

    KakaoAPI kakaoApi = new KakaoAPI();

    @RequestMapping(value ="/login")
    public String login(@RequestParam("code") String code, HttpSession session){
        ModelAndView mav = new ModelAndView();

        if(session.getAttribute("userId") != null){
            mav.setViewName("main");
            //return mav;
        }
        // 1.번 인증코드 전달
        String access_token = kakaoApi.getAccessToken(code);
        // 2.번 인증코드로 토큰 전달
        HashMap<String, Object> userInfo = kakaoApi.getUserInfo(access_token);

        System.out.println("login info : " + userInfo.toString());
        if(userInfo.get("email") != null){
            session.setAttribute("userId", userInfo.get("email"));
            session.setAttribute("access_token", access_token);
        }
        mav.addObject("userId", userInfo.get("email"));
        mav.setViewName("main");
        System.out.println("mav : " + mav);

        UserDto userDto = userService.signupUser(userInfo, session);
        return "redirect:/main";
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpSession session){
        ModelAndView mav = new ModelAndView();

        kakaoApi.kakaoLogout((String)session.getAttribute("access_token"));
        session.removeAttribute("access_token");
        session.removeAttribute("userId");
        mav.setViewName("index");
        return mav;
    }
    @GetMapping(value="/oauth")
    public String kakaoConnect(){
        StringBuffer url = new StringBuffer();
        url.append("https://kauth.kakao.com/oauth/authorize?");
        url.append("client_id=" + "클라이언트에 등록된 client_id");
        url.append("&redirect_uri=리다이렉트될 url");
        url.append("&response_type=code");

        return "redirect:" + url.toString();
    }

}
