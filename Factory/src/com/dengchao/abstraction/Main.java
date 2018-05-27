package com.dengchao.abstraction;

/**
 * @Title:工厂模式-抽象工厂模式
 * @Description:工厂方法模式与抽象工厂模式对比
                            1）工厂方法模式是一种极端情况的抽象工厂模式，而抽象工厂模式可以看成是工厂模式的推广
                            2）工厂方法模式用来创建一个产品的等级结构，而抽象工厂模式是用来创建多个产品等级结构
                            3）工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个抽象产品类

 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        PersonFactory factory = null;
        Girl girl = null;

        factory = new MCFactory();
        girl = factory.getGirl();
        girl.drawGirl();

        factory = new HNFactory();
        girl = factory.getGirl();
        girl.drawGirl();
    }

}
