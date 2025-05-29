package com.wxf.fly.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author Wxf
 * @since 2025-05-29 14:44:39
 **/
public class JdkProxyTest {


    public static void main(String[] args) {
        // 实例化接口
        MyInterface target = new MyInterfaceImpl();

        // 代理接口
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class[]{MyInterface.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before invoke");
                        Object result = method.invoke(target, args);
                        System.out.println("After invoke");
                        return result;
                    }
                }
        );

        // 调用
        proxy.sayHello();
    }
}
