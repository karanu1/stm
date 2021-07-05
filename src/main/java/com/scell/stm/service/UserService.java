package com.scell.stm.service;

import com.scell.stm.dto.UserDto;

import java.util.HashMap;

public interface UserService {
    public UserDto selectUser(HashMap<String, Object> userInfo);
}
