package com.bjpowernode.test;

import com.bjpowernode.vo2.School;
import com.bjpowernode.vo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.java.ClassPath;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/23 09:38
 */
public class MyTest2 {
    @Test
    public void Testschool() {
        // 创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("s02/applicationConfig.xml");
        // 取出对象
        School school = (School) ctx.getBean("school");
        System.out.println(school);
    }

    @Test
    public void Teststudent() {
        // 创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("s02/applicationConfig.xml");
        // 取出对象
        Student student = (Student) ctx.getBean("stu");
        System.out.println(student);
    }
}
