package com.dengchao.main;

/**
 * @Title:单例模式
 * @Description:静态内部类，Singleton5被装在了，INSTANCE不一定被初始化， 
 *                         只有通过调用getInstance方法时，才会装载SingletonHolder类，
 *                         从而实例化INSTANCE。
 * @author Administrator 2018-5-26-下午10:02:22
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {

    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
