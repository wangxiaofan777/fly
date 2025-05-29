package com.wxf.fly.proxy;

/**
 * @author Wxf
 * @since 2025-05-29 14:47:11
 **/
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }


    protected void sayHelloProtected() {
        System.out.println("hello");
    }

    private void sayHelloPrivate() {
        System.out.println("hello");
    }
}
