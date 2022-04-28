package com.bjpowernode.test;

import com.bjpowernode.vo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 21:41
 */
public class MyTest02 {
    @Test
    public void testStudent() {
        // 1、创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("vo2/applicationConfig.xml");
        // 2、取出对象
        Student student = (Student) ctx.getBean("student");
        // 3、测试
        System.out.println(student);
        // Student{name='李斯', age=27, school=School{name='清华大学', address='海淀区'}}
    }
}
