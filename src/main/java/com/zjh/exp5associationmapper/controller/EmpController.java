package com.zjh.exp5associationmapper.controller;

import com.zjh.exp5associationmapper.pojo.Dept;
import com.zjh.exp5associationmapper.pojo.Emp;
import com.zjh.exp5associationmapper.service.IDeptService;
import com.zjh.exp5associationmapper.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp") public class EmpController {
    @Autowired
    private IEmpService empService;
    @Autowired
    private IDeptService deptService;

    // http://localhost:8080/emp/find1/7369
    @RequestMapping("/find1/{empno}")
    @ResponseBody
    public List<Emp> findByEmpno(@PathVariable("empno") Integer empno) {
        return empService.findByEmpno(empno);
    }

    // http://localhost:8080/emp/find2/10
    @RequestMapping("/find2/{deptno}")
    @ResponseBody
    public List<Emp> findByDeptno(@PathVariable("deptno") Integer deptno) {
        return empService.findByDeptno(deptno);
    }

    // http://localhost:8080/emp/find3/10
    @RequestMapping("/find3/{deptno}")
    @ResponseBody
    public Dept findByDeptno1(@PathVariable("deptno") Integer deptno) {
        return deptService.findByDeptno(deptno);
    }
}
