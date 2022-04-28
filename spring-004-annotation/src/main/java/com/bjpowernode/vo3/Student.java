package com.bjpowernode.vo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/24 08:55
 */
@Component
public class Student {
    // 普通类型
    @Value("李斯")
    private String name;
    @Value("27")
    private Integer age;

    // 引用类型
    /**
     * 引用类型注入的两种方式：
     *  1、按类型注入
     *      @Autowired // 从整个Bean工厂中扫描同源类型的对象进行注入
     *  2、按名称注入，需要使用两个注解：
     *      @Autowired
     *      @Qualifier("schoolNew") // 加上这个注解，就会去Bean工厂中扫描schoolNew名称相同的对象并注入
     *
     */
    @Autowired  // 使用@Autowired按类型注入引用类型（给引用类型赋值）
    @Qualifier("schoolZi")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
