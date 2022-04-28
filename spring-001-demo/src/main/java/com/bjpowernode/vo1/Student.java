package com.bjpowernode.vo1;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/22 21:14
 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
        System.out.println("学生的无参构造方法");
    }

    // 创建对象默认调用Student的无参构造方法
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
