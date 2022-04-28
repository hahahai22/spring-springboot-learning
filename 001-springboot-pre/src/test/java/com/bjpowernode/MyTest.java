package com.bjpowernode;

import com.bjpowernode.config.SpringConfig;
import com.bjpowernode.vo.Cat;
import com.bjpowernode.vo.Phone;
import com.bjpowernode.vo.Student;
import com.bjpowernode.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 2021.2
 * @date 2022/4/21 18:30
 */
public class MyTest {

    /**
     * 使用xml配置容器
     */
    @Test
    public void test01() {

        // 指定配置文件
        String config = "applicationContext.xml";
        // 创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        // 获取对象
        Student student = (Student) ctx.getBean("mystudent");
        //
        System.out.println("student==" + student);
        System.out.println(student.getName() + student.getAge() + student.getSex());

    }


    /**
     * 使用JavaConfig配置容器
     */
    @Test
    public void test02() {
        //
        // 使用SpringConfig类代替.xml配置文件
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("creatStudent");
        System.out.println("使用JavaConfig获取Bean对象的==" + student);
    }

    @Test
    public void test03() {
        // 没有.xml配置文件，使用JavaConfig类代替.xml配置文件
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("lisiStudent");
        System.out.println("使用JavaConfig获取Bean对象的==" + student);
    }

    @Test
    public void test04() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) ctx.getBean("myCat");
        System.out.println("cat == " + cat);
    }

    @Test
    public void test05() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ctx.getBean("tiger");
        System.out.println("tiger == " + tiger);
    }

    // 使用.xml文件作为配置文件
    @Test
    public void test06(){
        // 1、指定配置文件
        String config = "phoneConfig.xml";
        // 2、创建容器，并将对象装配进容器（装配对象）
        // （要实现第3步的从phoneConfig.xml文件中取myPhone对象，首先要找到phoneConfig.xml文件）
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        // 3、通过容器调用对象实例（管理对象）
        Phone phone = (Phone) ctx.getBean("myPhone");
        System.out.println(phone);
    }
}
