package cn.simplelife.homewrk._05_simpledateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        /**
         * 获取当前时间
         */
        Date date = new Date();
        /**
         * 创建时间格式化的对象 并传入格式化规则
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /**
         * 调用格式化方法将当前时间传入
         */
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        /**
         * 解析字符串格式的时间，返回Date类型
         * 注意：转换规格要相互匹配否则会报出解析异常
         */
        try {
            Date parse = simpleDateFormat.parse(format);
            System.out.println(parse.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
