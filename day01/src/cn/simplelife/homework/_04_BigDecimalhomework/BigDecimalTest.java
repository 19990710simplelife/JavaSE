package cn.simplelife.homework._04_BigDecimalhomework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal0 = new BigDecimal("50");
        BigDecimal bigDecimal1 = new BigDecimal("50.19");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        BigDecimal bigDecimal3 = new BigDecimal("10");
        //加
        System.out.println(bigDecimal0.add(bigDecimal1));
        //减
        System.out.println(bigDecimal0.subtract(bigDecimal1));
        //乘
        System.out.println(bigDecimal0.multiply(bigDecimal1.setScale(2, BigDecimal.ROUND_HALF_UP)));
        //除
        System.out.println(bigDecimal2.divide(bigDecimal3, 2, RoundingMode.HALF_UP));
    }
}
