package com.dengchao.method;

import java.util.Map;

public class HairFactory {

    /**
     * @Decription:根据类型来创建对象
     * @param key
     * @return:HairInterface
     */
    public HairInterface getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        }
        return null;
    }

    /**
     * @Decription:根据类的名称来生产对象
     * @param className
     * @return:HairInterface
     */
    public HairInterface getHairByClass(String className) {
        try {
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     *@Decription:根据类的名称来生产对象
     *@param key
     *@return:HairInterface
     */
    public HairInterface getHairByClassKey(String key) {
        Map<String, String> map = new PropertiesReader().getProperties();
        try {
            HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
