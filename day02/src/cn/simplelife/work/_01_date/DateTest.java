package cn.simplelife.work._01_date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // 1、创建时间对象
        Date date = new Date();
        System.out.println(date);
        // 2、获取时间戳
        System.out.println(date.getTime());
        System.out.println(date.toLocaleString());
    }
}
