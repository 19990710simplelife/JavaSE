package cn.simplelife._09_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigdecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("100");
        BigDecimal bigDecimal1 = new BigDecimal("100.123");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        BigDecimal bigDecimal3 = new BigDecimal("10");

        // 加法操作
        BigDecimal add = bigDecimal.add(bigDecimal1);
        System.out.println(add);
        // 减法操作
        BigDecimal subtract = bigDecimal.subtract(bigDecimal1);
        System.out.println(subtract);
        // 乘法操作
        BigDecimal multiply = bigDecimal.multiply(bigDecimal1.setScale(3, BigDecimal.ROUND_HALF_UP));
        System.out.println(multiply);
        // 除法操作
        BigDecimal divide = bigDecimal2.divide(bigDecimal3, 2, RoundingMode.HALF_UP);
        System.out.println(divide);
    }
}
