package com.bjpowernode.config;

import com.bjpowernode.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @author
 * @version 2021.2
 * @date 2022/4/21 18:57
 *
 * @Configuration是Spring提供的使用Java类配置容器（等同于.xml配置文件）
 *
 * SpringConfig相当于applicationContext.xml，可以在其中声明Bean，即@Bean,表示方法的返回值的对象放入到容器中
 * @Bean==<bean></bean>
 */
@Configuration
// @ImportResource作用导入xml配置，等同于xml文件的resource
@ImportResource(value = {"classpath:beans.xml", "classpath:applicationContext.xml"})
// 使用@PropertySource指定property文件的位置，读取properties属性配置文件,即属性配置文件
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "com.bjpowernode.vo")  // 即组件扫描器，扫描组件
public class SpringConfig {
    /**
     * 定义方法，方法的返回值是对象，将对象返回，相当于.xml配置文件中的bean标签
     * 这个对象注入到spring ioc容器
     *
     * @Bean如果没有使用属性，则方法名即为对象名称
     *
     * @Bean这个注解，表示把对象注入到容器中，相当于.xml文件中的<bean>标签
     *
     *
     */
    @Bean
    public Student creatStudent() {
        Student student = new Student();
        student.setName("张三");
        student.setAge(22);
        student.setSex("男");
        return student;
    }

    /**
     * @Bean使用属性，属性name的值则是对象名称
     */
    @Bean(name="lisiStudent")
    public Student makeStudent() {
        Student student = new Student();
        student.setName("李斯");
        student.setAge(22);
        student.setSex("男");
        return student;
    }
}
