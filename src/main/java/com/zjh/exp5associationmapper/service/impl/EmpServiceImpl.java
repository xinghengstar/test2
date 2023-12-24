package com.zjh.exp5associationmapper.service.impl;

import com.zjh.exp5associationmapper.mapper.EmpMapper;
import com.zjh.exp5associationmapper.pojo.Emp;
import com.zjh.exp5associationmapper.service.IEmpService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {
    @Resource
    private EmpMapper empDao;
    @Override
    public List<Emp>findByEmpno(Integer empno) {
        return empDao.findByEmpno(empno); }
    @Override
    public List<Emp> findByDeptno(Integer deptno) {
        return empDao.findByDeptno(deptno); }
}
