package com.zjh.exp5associationmapper.mapper;

import com.zjh.exp5associationmapper.pojo.Class;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassMapper {
    Class getClass(Integer id);
    Class getClass2(Integer id);
}
