package com.dengchao.extend;

public class Client {

    /**
     * @Decription:代理模式，使用继承方式实现
     * @param args
     * @return:void
     */
    public static void main(String[] args) {
        Moveable m = new Car2();
        m.move();
    }

}
