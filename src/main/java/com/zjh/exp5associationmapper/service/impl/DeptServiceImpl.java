package com.zjh.exp5associationmapper.service.impl;

import com.zjh.exp5associationmapper.mapper.DeptMapper;
import com.zjh.exp5associationmapper.pojo.Dept;
import com.zjh.exp5associationmapper.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DeptMapper deptDao;

    @Override
    public Dept findByDeptno(Integer deptno) {
        return deptDao.findByDeptno(deptno); }
}
