package com.bjpowernode.vo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 18:35
 * 只要实体类上有@component这一类的注解，Spring就去创建对象 。但是需要在配置文件中添加包扫描，找到这个注解，找到这个包
 */
@Component("stu")
public class Student {
    @Value("张三")
    private String name;

    @Value("27")
    private Integer age;

    public Student() {
        System.out.println("Student对象的无参构造方法。。。。。。。。。");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
