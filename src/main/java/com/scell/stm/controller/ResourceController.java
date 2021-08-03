package com.scell.stm.controller;

import com.scell.stm.dao.ResourceDao;
import com.scell.stm.dto.ResourceDto;
import com.scell.stm.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ResourceController {

    @Autowired
    ResourceDao resourceDao;

    @PostMapping("/deposit")
    public int deposit(String data, HttpSession session) {
        UserDto userDto = (UserDto) session.getAttribute("userInfo");
        //Map<String, Object> map = (Map<String, Object>) session.getAttribute("userInfo");

        ResourceDto resourceDto = new ResourceDto();

        resourceDto.setUseType("003001"); //월회비
        resourceDto.setLinkedId(userDto.getId());
        resourceDto.setResourceChange(20000);

        int ss = resourceDao.depositResource(resourceDto);
        //map.put("tmp", "tmp");
        return ss;
    }
}
