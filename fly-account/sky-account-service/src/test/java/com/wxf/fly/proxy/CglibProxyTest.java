package com.wxf.fly.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * CGLIB 动态代理
 *
 * @author Wxf
 * @since 2025-05-29 14:44:53
 **/
public class CglibProxyTest {


    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyInterfaceImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("Before invoke");
                Object result = methodProxy.invokeSuper(o, args);
                System.out.println("After invoke");
                return result;
            }
        });

        // 创建代理
        MyInterfaceImpl myInterface = (MyInterfaceImpl) enhancer.create();
        myInterface.sayHello();
    }
}
