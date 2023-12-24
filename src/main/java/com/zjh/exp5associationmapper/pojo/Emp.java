package com.zjh.exp5associationmapper.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Float sal;
    private Float comm;
    private Dept dept;
}
