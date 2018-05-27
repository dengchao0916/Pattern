package com.dengchao.aggregaitonplus;

public class Client {

    /**
     * @Decription:代理模式，使用聚合实现代理对象功能的叠加
     * @param args
     * @return:void
     */
    public static void main(String[] args) {
        Car car = new Car();
        CarLogProxy clp = new CarLogProxy(car);
        clp.move();
        System.out.println("-----------");
        CarTimeProxy ctp = new CarTimeProxy(clp);
        ctp.move();
    }

}
