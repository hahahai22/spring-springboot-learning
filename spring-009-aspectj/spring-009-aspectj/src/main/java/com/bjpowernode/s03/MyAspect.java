package com.bjpowernode.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/26 15:50
 * 环绕通知
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 返回值是String也可以修改
     * 环绕通知方法的规范
     * 1）访问权限是public
     * 2）切面方法有返回值，此返回值就是目标方法的返回值
     * 3）方法名称自定义
     * 4）方法有参数，此参数就是目标方法
     * 5）回避异常Throwable
     * 6）使用@Around注解声明是环绕通知
     *  参数：
     *  value 指定切入点表达式
     */
    @Around(value = "execution(* com.bjpowernode.s03.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        // 前切功能实现
        System.out.println("环绕通知中前置方法的实现。。。。。。");
        // 目标方法调用
        Object obj = pjp.proceed(pjp.getArgs());
        // 后切功能实现
        System.out.println("环绕通知中后置方法的实现。。。。。。");
        return obj.toString().toUpperCase();    // 改变目标方法的返回值
    }
}
