package cn.simplelife.work._03_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        // 1、定义一个字符串时间格式
        String input = "2018-05-18 15:05:30";
        // 2、获取simpleDateFormat对象并设置时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 3、解析字符串格式的时间，返回一个date对象
        Date parse = simpleDateFormat.parse(input);
        // 4、获取calendar对象
        Calendar calendar = Calendar.getInstance();
        // 5、设置日历时间为我们给定的时间
        calendar.setTime(parse);
        // 6、手动设置时间为当天的最后一秒
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        Date endTime = calendar.getTime();
        System.out.println("endTime = " + endTime);
        // 7、设置七天前的时间
        calendar.add(Calendar.SECOND, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        Date startTime = calendar.getTime();
        System.out.println("startTime = " + startTime);
    }
}
