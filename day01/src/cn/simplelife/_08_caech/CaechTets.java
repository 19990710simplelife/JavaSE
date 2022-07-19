package cn.simplelife._08_caech;

/**
 * 超出缓存的范围会重新new对象[-128~127]--Byte Integer Long Short
 */
public class CaechTets {
    public static void main(String[] args) {
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);
        System.out.println(integer1 == integer2);

        Integer integer3 = Integer.valueOf(123);
        Integer integer4 = Integer.valueOf(123);
        System.out.println(integer3 == integer4);

        Integer integer5 = 128;
        Integer integer6 = 128;
        System.out.println(integer5 == integer6);
    }
}
