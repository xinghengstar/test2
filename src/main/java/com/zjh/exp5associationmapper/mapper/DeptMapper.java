package com.zjh.exp5associationmapper.mapper;

import com.zjh.exp5associationmapper.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
        public Dept findByDeptno(Integer deptno);
}


