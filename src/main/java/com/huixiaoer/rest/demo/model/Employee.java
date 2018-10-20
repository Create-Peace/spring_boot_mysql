package com.huixiaoer.rest.demo.model;

/**
 * @author create by jiazhaolin
 * @create 2018/10/13
 * @email zhaolin.jia@huixiaoer.com
 * @description
 */
public class Employee {

    private Integer id;
    private String name;
    /** 已婚 true  未婚 false */
    private Boolean marry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMarry() {
        return marry;
    }

    public void setMarry(Boolean marry) {
        this.marry = marry;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marry=" + marry +
                '}';
    }
}
