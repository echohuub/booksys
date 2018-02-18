package com.heqingbao.booksys.domain;

public class Category {
    private Integer id;
    // 种类名
    private String name;
    // 种类描述
    private String desc;

    // 标识属性的getter、setter方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // name成员变量的getter、setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // desc成员变量的getter、setter方法
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
