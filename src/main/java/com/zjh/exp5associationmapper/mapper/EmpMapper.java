package com.zjh.exp5associationmapper.mapper;

import com.zjh.exp5associationmapper.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    public List<Emp> findByEmpno(Integer empno);
    public List<Emp> findByDeptno(Integer deptno);
}
