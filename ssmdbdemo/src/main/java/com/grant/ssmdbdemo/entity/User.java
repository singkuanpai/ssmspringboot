package com.grant.ssmdbdemo.entity;

/**
 * @author grantbai
 * @title: User
 * @projectName ssmdbdemo
 * @description: TODO
 * @date 2020/2/23 09:48
 */
public class User {
    private Long id;
    private String name;
    private Integer age;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", age=" + age +
                '}';
    }
}
