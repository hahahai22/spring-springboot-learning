package com.bjpowernode.vo2;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 10:02
 */
public class Student {

    private String name;
    private Integer age;

    // 引用类型
    private School school;

    // setter方法
    public void setName(String name) {
        this.name = name;
    }

    // 无参构造方法
    public Student() {
        System.out.println("Student的无参构造方法");
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
