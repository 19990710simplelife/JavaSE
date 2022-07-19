package cn.simplelife._06_interger;

/**
 * Integer的包装类中封装了一些方法，方便我们使用可以简便的进行数据类型转换
 */
public class IntegerWrapper {
    public static void main(String[] args) {
        // 1、将int基本数据类型转为字符串
        int i = 1000;                           // 声明一个int类型的变量i
        Integer integer = Integer.valueOf(i);   // 将int类型转换为Integer类型
        String s = integer.toString();          // 将Integer类型转为String类型
        String s1 = Integer.toString(Integer.valueOf(10)); //简化写法
        String s2 = Integer.toString(1002);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("--------------------------------");
        //2、将String类型转为int类型
        String str = "13124";
        Integer integer1 = Integer.valueOf(str);
        int i2 = integer.intValue();
        System.out.println(i2);
        System.out.println(integer1);
        int i1 = Integer.parseInt(str);
        System.out.println(i1);
    }
}
