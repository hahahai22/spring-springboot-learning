package com.bjpowernode.test;

import com.bjpowernode.vo3.School;
import com.bjpowernode.vo3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 09:38
 */
public class MyTest3 {
    @Test
    public void testSchool() {
        // 1、创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("s03/applicationConfig.xml");
        // 2、取出对象
        School school = (School) ctx.getBean("school");
        // 3、测试
        System.out.println(school);
    }

    @Test
    public void testStudent() {
        // 1、创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("s03/applicationConfig.xml");
        // 2、取出对象
        Student student = (Student) ctx.getBean("stu");
        // 3、测试
        System.out.println(student);
    }

    @Test
    public void testStudent02 () {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("s03/applicationConfig.xml");
        Student student = (Student) ctx.getBean("stu1");
        System.out.println(student);
    }
}
