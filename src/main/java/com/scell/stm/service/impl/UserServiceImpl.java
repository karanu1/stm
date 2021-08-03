package com.scell.stm.service.impl;

import com.scell.stm.dao.UserDao;
import com.scell.stm.dto.UserDto;
import com.scell.stm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public UserDto signupUser(HashMap<String, Object> userInfo, HttpSession session) {
        UserDto userDto = new UserDto();
        UserDto dto = dao.selectUserInfo(userInfo.get("email").toString());
        try{
            if(dto == null){ //이러면 회원가입 해야됨!
                userDto.setEmail(userInfo.get("email").toString());
                System.out.println(userDto.getEmail());
                userDto.setNickname(userInfo.get("nickname").toString());
                userDto.setProfileImage(userInfo.get("proImg").toString());
                userDto.setThumbnailImage(userInfo.get("thumImg").toString());
                userDto.setActivity('R');
                userDto.setAuth("00000");
                userDto.setType("00000");
                dao.insertUser(userDto);
                session.setAttribute("userInfo", userDto);
            }
            else{ //이미 회원가입함
                System.out.println("히히!현현!");
                System.out.println(dto);
                session.setAttribute("userInfo", dto);
            }
            System.out.println(userDto);
        } catch(Exception e) {
            e.printStackTrace();
        }

        return userDto;
    }
}
