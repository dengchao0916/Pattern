package com.dengchao.method;

/**
 *@Title:工厂模式-工厂方法模式
 *@Description:定义一个接口来创建对象，但是让子类来决定哪些类需要被实例化，
 *                       工厂方法把实例化的工作推迟到子类中去实现。
 *                       1）有一组类似的对象需要创建
 *                       2）在编码时，不能预见需要创建哪种类的实例
 *                       3）系统需要考虑扩展性，不应依赖于产品类实例如何被创建、组合和表达的细节
 *@author Administrator
 */
public class Main {

    public static void main(String[] args) {
        
        HairFactory factory = new HairFactory();
        HairInterface hif = null;
        hif = factory.getHair("left");
        hif.draw();
        
        hif = factory.getHairByClass("com.dengchao.main.LeftHair");
        hif.draw();
        
        hif = factory.getHairByClassKey("left");
        hif.draw();
    }
}