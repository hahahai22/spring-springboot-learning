package com.proxy5;

import com.proxy4.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/27 15:48
 */
public class ProxyFactory {
    public static Object getAgent(Service target, AOP aop) {
        // 返回生成的动态代理对象
        return Proxy.newProxyInstance(
                // 类加载器
                target.getClass().getClassLoader(),
                // 目标对象实现的所有接口
                target.getClass().getInterfaces(),
                // 代理功能实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            // 生成的代理对象
                            Object proxy,
                            // 正在被调用的目标对象 buy() show()
                            Method method,
                            // 目标方法的参数
                            Object[] args) throws Throwable {
                        Object obj = null;
                        try {
                            // 切面
                            aop.before();
                            // 业务
                            obj = method.invoke(target, args);
                            // 切面
                            aop.after();
                        } catch (IllegalAccessException e) {
                            // 切面
                            aop.exception();
                        }

                        // 切面

                        return obj;     // 目标方法的返回值
                    }
                }
        );
    }
}
