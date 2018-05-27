package com.dengchao.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
    
    //被代理对象(目标对象)
    private Object target;
   
    public TimeHandler(Object target) {
        this.target = target;
    }
    
    /*
     * 参数：
     * proxy  被代理对象
     * method  被代理对象的方法
     * args 方法的参数
     * 
     * 返回值：
     * Object  方法的返回值
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        method.invoke(target);
        long endtime = System.currentTimeMillis();
        System.out.println("汽车行驶结束。。。");
        System.out.println("汽车行驶时间：" + (endtime - starttime) + "毫秒！");
        return null;
    }

}
