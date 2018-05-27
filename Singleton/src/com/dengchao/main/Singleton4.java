package com.dengchao.main;

/**
 *@Title:单例模式
 *@Description:饿汉模式的变种
 *@author Administrator
 * 2018-5-26-下午9:59:14
 */
public class Singleton4 {
    private static Singleton4 instance = null;

    static {
        instance = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
