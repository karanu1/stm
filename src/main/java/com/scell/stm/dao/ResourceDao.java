package com.scell.stm.dao;

import com.scell.stm.dto.ResourceDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResourceDao {
    int depositResource(ResourceDto dto);
}
