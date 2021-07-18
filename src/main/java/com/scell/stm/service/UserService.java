package com.scell.stm.service;

import com.scell.stm.dto.UserDto;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

public interface UserService {
    public UserDto signupUser(HashMap<String, Object> userInfo, HttpSession session);
}
