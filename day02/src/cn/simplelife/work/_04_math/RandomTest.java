package cn.simplelife.work._04_math;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // 定义一个字符串，保存验证码
        StringBuilder str = new StringBuilder(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            str.append((char) (65 + random.nextInt(26)));
        }
        System.out.println(str);
    }
}
