package com.zjh.exp5associationmapper.controller;

import com.zjh.exp5associationmapper.pojo.Class;
import com.zjh.exp5associationmapper.service.IClassService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/class")
public class ClassController {
    @Resource
    private IClassService classService;

    // http://localhost:8080/class/getclass/1
    @RequestMapping("/getclass/{id}")
    @ResponseBody
    public Class getClass(@PathVariable("id") Integer id) {
// TODO Auto-generated method stub
        return classService.getClass(id);
    }
    // http://localhost:8080/class/getclass2/1
    @RequestMapping("/getclass2/{id}")
    @ResponseBody
    public Class getClass2(@PathVariable("id") Integer id) {
// TODO Auto-generated method stub
        return classService.getClass2(id);
    }
}
