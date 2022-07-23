package cn.simplelife.homework.practice;

import java.math.BigDecimal;

public class TestDmo01 {
    public static void main(String[] args) {
        getM(100, 10);
    }

    public static void getM(double height, int nums) {
        double sum = 0.0;
        for (int i = 0; i < nums; i++) {
            sum += height;
            height = height / 2;
        }
        System.out.println(sum + 100);
        System.out.println(height);
    }
}
