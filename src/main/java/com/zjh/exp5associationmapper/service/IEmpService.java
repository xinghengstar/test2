package com.zjh.exp5associationmapper.service;

import com.zjh.exp5associationmapper.pojo.Emp;

import java.util.List;

public interface IEmpService {
    public List<Emp> findByEmpno(Integer empno);
    public List<Emp>findByDeptno(Integer deptno);
}
