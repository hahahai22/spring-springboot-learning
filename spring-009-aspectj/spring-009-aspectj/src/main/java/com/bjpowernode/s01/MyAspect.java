package com.bjpowernode.s01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/25 15:44
 * 切面类，包含各种切面方法
 * 前置通知
 */
@Aspect // 这个注解的意思是，交给Aspectj框架去识别切面类
@Component // 交给Spring容器去处理，使被扫描到，创建对象。
public class MyAspect {
    /**
     * 所有切面的功能都是由切面方法来实现的
     * 可以将各种切面都在此类中进行开发
     *
     * 前置通知的切面方法的规范
     * 1）访问权限是public
     * 2）方法的返回值是void
     * 3）方法名称自定义
     * 4）方法没有参数。如果有，也只能是JoinPoint类型的
     * 5）必须使用@Before注解来声明切入的时机是前切功能和切入点
     *      参数 value 指定切入表达式
     *
     *      业务方法：public String doSome(String name, int age)
     *
     * 说明：
     * 这个功能
     * System.out.println("切面功能中的前置通知功能实现。。。。。");
     * 前切到了这个方法
     * com.bjpowernode.s01.SomeServiceImpl.doSome(String, int)
     * 上
     */
    //@Before(value = "execution(public String com.bjpowernode.s01.SomeServiceImpl.doSome(String, int))")
    /*
    @Before(value = "execution(public * com.bjpowernode.s01.SomeServiceImpl.*(..))")
    public void MyBefore() {
        System.out.println("切面功能中的前置通知功能实现。。。。。");
    }
     */

    @Before(value = "execution(* com.bjpowernode.s01.*.*(..))")
    public void MyBefore(JoinPoint jp) {
        System.out.println("切面功能中的前置通知功能实现。。。。。");
        System.out.println("得到目标方法的签名：" + jp.getSignature());
        System.out.println("得到目标方法的参数：" + Arrays.toString(jp.getArgs()));
    }


}
