package cn.simplelife.homewrk._07_calculator;

import java.math.BigDecimal;

/**
 * 加法类实现计算接口
 */
public class Divide implements ICompute {
    @Override
    public int computer(int n, int m) {
        int result = 0;
        if (m == 0) {
            System.out.print("Error!");
            return -1;
        } else if (n == 0) {
            return result;
        } else {
            result = n / m;
            return result;
        }
    }
}
