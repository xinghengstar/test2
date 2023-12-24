package com.zjh.exp5associationmapper.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Dept {

    private Integer deptno;
    private String dname;
    private String location;
    private List<Emp> emps;
}
