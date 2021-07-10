package com.scell.stm.dao;

import com.scell.stm.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    void insertUser(UserDto userDto);

    UserDto selectUserInfo(String email);

    List<UserDto> selectUser();
}
