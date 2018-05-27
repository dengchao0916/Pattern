package com.dengchao.aggregaitonplus;

public class CarTimeProxy implements Moveable {

    private Moveable m;

    public CarTimeProxy(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶。。。");
        m.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车行驶结束。。。");
        System.out.println("汽车行驶时间：" + (endtime - starttime) + "毫秒！");

    }

}
