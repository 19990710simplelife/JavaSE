package cn.simplelife.work._07_autoboxandautounbox;

public class AutoBox {
    public static void main(String[] args) {
        Integer integer = new Integer(18);
        Integer integer1 = Integer.valueOf(19);
        int i = integer.intValue();
        int i1 = integer1.intValue();
        System.out.println(integer);
        System.out.println(integer1);

        Integer num = 100; //自动装箱将基本数据类型转为Interger类型
        num = 10;          //自动拆箱将Integer类型转为基本数据类型
        Object num1 = 18;  // 先自动装箱 再形成多态
    }
}
