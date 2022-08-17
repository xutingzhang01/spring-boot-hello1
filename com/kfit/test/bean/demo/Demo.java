package com.kfit.test.bean.demo;

/**
 *
 * 测试实体类
 *
 *
 */

public class Demo {

    private long id; //主键

    private String name; //测试名称

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
