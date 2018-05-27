package com.dengchao.aggregation;

public class Car2 implements Moveable {

    private Car car;

    public Car2(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶。。。");
        car.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车行驶结束。。。");
        System.out.println("汽车行驶时间：" + (endtime - starttime) + "毫秒！");
    }

}
