package com.dengchao.aggregation;

public class Client {

    /**
     * @Decription:代理模式，使用聚合方式实现
     * @param args
     * @return:void
     */
    public static void main(String[] args) {
        Car car = new Car();
        Moveable m = new Car2(car);
        m.move();

    }

}
