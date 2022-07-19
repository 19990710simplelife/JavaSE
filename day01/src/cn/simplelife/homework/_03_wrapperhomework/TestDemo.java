package cn.simplelife.homework._03_wrapperhomework;

public class TestDemo {
    public static void main(String[] args) {
        //1、基本类型转包装类
        int num = 10;
        Integer integer0 = Integer.valueOf(num);
        Integer integer1 = new Integer(num);

        Integer integer2 = num; //自动装箱
        //2、包装类转基本类型
        String num2 = "1000";
        //string----->Integer
        Integer integer = Integer.valueOf(num2);
        // Ingeter---->int
        int i2 = integer.intValue();
        // String ----->int
        int i = Integer.parseInt(num2);

        int i1 = integer;//自动拆箱
    }
}
