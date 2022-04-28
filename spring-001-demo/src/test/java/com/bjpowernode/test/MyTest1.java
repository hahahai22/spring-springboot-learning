package com.bjpowernode.test;

import com.bjpowernode.vo1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/22 21:18
 */
public class MyTest1 {

    @Test
    public void testStudent() {
        Student student = new Student();
        System.out.println("程序员创建对象：" + student);
    }
    @Test
    public void testStudentSpring (){
        // String config = "applicationConfig.xml";
        // 创建容器并启动。如果想从Spring容器中取出对象，则需要创建容器对象并启动，才可以取对象
        ApplicationContext act = new ClassPathXmlApplicationContext("s01/applicationConfig.xml ");
        // 取对象。getBean拿到的都是Object对象，强制类型转换成Student对象
        Student student = (Student) act.getBean("stu");
        System.out.println("Spring容器创建对象并注入依赖：" + student);
    }
}
