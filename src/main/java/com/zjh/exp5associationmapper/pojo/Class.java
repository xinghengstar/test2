package com.zjh.exp5associationmapper.pojo;

import lombok.Data;

@Data
public class Class {
    private int id;
    private String name;
    private Teacher teacher;
}
