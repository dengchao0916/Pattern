package com.dengchao.main;

/**
 * @Title:单例模式
 * @Description:饿汉模式，加载类时比较慢，但运行时获取对象的速度比较快，线程安全
 * @author Administrator
 */
public class Singleton {
    // 构造方法私有化，不允许外部直接创建对象
    private Singleton() {

    }

    // 当类加载的时候，直接创建对象
    private static Singleton instance = new Singleton();

    // 暴露给外部调用，获取实例对象
    public Singleton getInstance() {
        return instance;
    }
}
