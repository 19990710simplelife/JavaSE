package cn.simplelife.homewrk._02_randomhomework;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        /**
         * 获取随机数对象
         */
        Random random = new Random();
        /**
         * 生成int范围内的随机数
         */
        int i = random.nextInt();
        System.out.println(i);
        System.out.println("--------------------------");
        /**
         * 生成[0-10)之间的随机数
         */
        int i1 = random.nextInt(10);
        System.out.println(i1);
        System.out.println("--------------------------");
        /**
         * 生成[0-10]之间的随机数
         */
        int i2 = random.nextInt(11);
        System.out.println(i2);
        System.out.println("--------------------------");
        /**
         * 生成[10-40]之间的随机数
         */
            int i3 = 10 + random.nextInt(31);
            System.out.print(i3+" ");

    }
}
