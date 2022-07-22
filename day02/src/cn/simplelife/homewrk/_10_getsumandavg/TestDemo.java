package cn.simplelife.homewrk._10_getsumandavg;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        String[] strs = {"2+3+4", "2+4", "5+6", "9+7"};
        /**
         * 遍历数组得到每一项
         */
        double sum = 0;
        double length = 0;
        for (int i = 0; i < strs.length; i++) {
            //将数组中的每一项按照+号分割为字符串数组
            String[] split = strs[i].split("\\+");
            //遍历字符串数组得到每一个值
            for (int j = 0; j < split.length; j++) {
                //将值转为int类型进行计算
                int integer = Integer.parseInt(split[j]);
                sum += integer;
                // 统计个数
                length++;
            }
        }
        System.out.println("总和是：" + sum);
        System.out.println("平均值是:" + sum / length);
    }
}
