package com.dengchao.main;

/**
 *@Title:单例模式
 *@Description:懒汉模式，双重校验锁，线程安全
 *@author Administrator
 */
public class Singleton3 {
    private volatile static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (null == instance) {
            synchronized (Singleton3.class) {
                if (null == instance) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
