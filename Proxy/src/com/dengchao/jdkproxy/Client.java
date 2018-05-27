package com.dengchao.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    /**
     * @Decription:
     * @param args
     * @return:void
     */
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class<?> clazz = car.getClass();
        
        /**
         * loader  类加载器
         * interfaces  实现接口
         * h InvocationHandler
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), h);
        m.move();
    }

}
