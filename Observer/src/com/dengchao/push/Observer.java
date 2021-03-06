package com.dengchao.push;

/**
 * @Title:Observer
 * @Description:观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @author Administrator
 */
public interface Observer {
    /**
     * @Decription:更新的接口
     * @param weatherContent
     * @return:void
     */
    void update(String weatherContent);

}
