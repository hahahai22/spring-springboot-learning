package com.bjpowernode.s04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/27 11:24
 * 最终通知
 */
@Aspect // 这个注解的意思是，交给Aspectj框架去识别切面类
@Component // 交给Spring容器去创建对象
public class MyAspect {
    /**
     * 最终通知方法的书写规范：
     * 1）访问权限是public
     * 2）方法没有返回值
     * 3）方法名称自定义
     * 4）没有参数，要是有也是JoinPoint
     * 5）使用@After注解
     *  参数：
     *  value 指定切入点表达式
     */
    @After(value = "execution(* com.bjpowernode.s04.*.*(..))")
    public void MyAfter() {
        System.out.println("最终通知方法执行。。。。。");
    }
}
