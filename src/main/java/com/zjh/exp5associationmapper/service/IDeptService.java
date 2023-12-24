package com.zjh.exp5associationmapper.service;

import com.zjh.exp5associationmapper.pojo.Dept;

public interface IDeptService {
    public Dept findByDeptno(Integer deptno);
}
