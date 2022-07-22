package cn.simplelife.homewrk._01mathhomework;

public class MathDemo {
    public static void main(String[] args) {
        /**
         * 随机生成[0-1)之间的随机小数
         */
        double random = Math.random();
        System.out.println(random);
        System.out.println("-------------------");
        /**
         * 生成[1-10]之间的随机数
         */
        int random1 = (int) (Math.random() * 10) + 1;
        System.out.println(random1);
    }
}
