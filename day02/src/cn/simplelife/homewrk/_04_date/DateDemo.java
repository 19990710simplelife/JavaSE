package cn.simplelife.homewrk._04_date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        /**
         * 创建一个时间对象
         */
        Date date = new Date();
        /**
         * 默认返回当前时间
         */
        System.out.println(date);
        /**
         * 获取时间戳 从1970-1-1 00：00：00 到目前时间的毫秒数
         */
        long time = date.getTime();
        System.out.println(time);
    }
}
