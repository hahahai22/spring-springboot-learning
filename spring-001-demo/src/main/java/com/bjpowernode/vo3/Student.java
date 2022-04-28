package com.bjpowernode.vo3;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 17:12
 */
public class Student {
    private String name;
    private String age;

    // 引用类型的成员变量
    private School school;

    // 使用有参的构造方法注入值
    public Student(String name, String age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school=" + school +
                '}';
    }
}
