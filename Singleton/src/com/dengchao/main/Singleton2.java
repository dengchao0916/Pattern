package com.dengchao.main;

/**
 * @Title:单例模式
 * @Description:懒汉模式，加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 * @author Administrator
 */
public class Singleton2 {
    // 构造方法私有化，不允许外部直接创建对象
    private Singleton2() {

    }

    // 声明类实例
    private Singleton2 instance;

    // 暴露给外部调用，获取实例对象
    public Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
}
