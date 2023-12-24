package com.zjh.exp5associationmapper.service.impl;

import com.zjh.exp5associationmapper.mapper.ClassMapper;
import com.zjh.exp5associationmapper.pojo.Class;
import com.zjh.exp5associationmapper.service.IClassService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements IClassService {
    @Resource
    private ClassMapper classDao;

    @Override
    public Class getClass(Integer id) {
        return classDao.getClass(id);
    }
    @Override
    public Class getClass2(Integer id) {
        return classDao.getClass2(id);
    }
}
