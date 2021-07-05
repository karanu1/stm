package com.scell.stm.dao;

import com.scell.stm.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void insertUser(UserDto userDto);

    UserDto selectUser(String email);
}
