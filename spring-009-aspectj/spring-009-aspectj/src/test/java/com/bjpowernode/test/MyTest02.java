package com.bjpowernode.test;

import com.bjpowernode.s02.SomeService;
import com.bjpowernode.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/25 16:15
 */
public class MyTest02 {
    @Test
    public void Test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        // 取出代理对象
        /**
         * 下面这个对象someService已经不是原始的一个业务实现的功能，而是加入切面功能的对象
         */
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("zhangsan", 22);
        System.out.println("在测试方法中，目标方法的返回值" + s);

        /**运行结果：说明String类型改变返回值没有用
         *
         * doSome业务方法（目标方法）的实现(被执行)。。。。。
         * 后置通知方法的实现。。。。。
         * 在切面方法中，目标方法的返回值：ABCD
         * 在测试方法中，目标方法的返回值abcd
         */
    }


    @Test
    public void Test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        // 取出代理对象
        /**
         * 下面这个对象someService已经不是原始的一个业务实现的功能，而是加入切面功能的对象
         */
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        Student student = someService.change();
        System.out.println("在测试方法中，目标方法的返回值" + student);


        /**输出结果，表明在切面方法中对目标方法的返回值修改成功
         *
         * change方法被执行。。。。。
         * 后置通知方法的实现。。。。。
         * 在切面方法中，修改目标方法的引用类型的返回值：Student{name='王五'}
         * 在测试方法中，目标方法的返回值Student{name='王五'}
         */
    }
}
