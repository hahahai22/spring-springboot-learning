package com.bjpowernode.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/26 09:07
 * 后置通知
 */
@Aspect  // 交给AspectJ框架去处理（交给AspectJ框架去识别切面类）
@Component // 交给Spring容器去创建对象
public class MyAspect {

    /**
     * 后置通知的方法的书写规范：
     * 1）访问权限是public
     * 2）方法没有返回值 void
     * 3）方法名称自定义
     * 4）方法有参数（但是如果目标方法没有返回值，则可以写无参方法。但一般写有参，这样可以处理有参，也可以处理无参）
     * 5）使用@AfterReturning注解表明是后置通知
     *  参数：value 指定切入点表达式
     *       returning 指定目标方法返回值名称，该名称必须和切面方法的参数名称一致。
     */
    @AfterReturning(value = "execution(* com.bjpowernode.s02.*.*(..))", returning = "obj")
    // 任意返回值 s02包下的任意类，任意方法的任意参数。
    public void myAfterReturning(Object obj) {
        System.out.println("后置通知方法的实现。。。。。");
        if (obj != null) {
            if (obj instanceof String) {
                obj = obj.toString().toUpperCase();
                System.out.println("在切面方法中，目标方法的返回值：" + obj);
            }
            if (obj instanceof Student) {
                Student stu = (Student) obj;
                stu.setName("王五");
                System.out.println("在切面方法中，修改目标方法的引用类型的返回值：" + stu);
            }
        }
    }

}
