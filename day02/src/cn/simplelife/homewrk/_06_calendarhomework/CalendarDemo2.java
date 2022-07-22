package cn.simplelife.homewrk._06_calendarhomework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
    public static void main(String[] args) {
        /**
         * 因为Calendar类是抽象类所以不能直接new对象，但是可以调用其提供的静态方法获取对象
         * 使用默认时区和区域设置获取日历
         */
        Calendar instance = Calendar.getInstance();
        /**
         * 返回一个Date类型的时间，默认获取当前时间
         */
        Date time = instance.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("time = " + simpleDateFormat.format(time));
        /**
         * 直接设置时间
         */
        instance.set(Calendar.HOUR_OF_DAY, 23);
        instance.set(Calendar.MINUTE, 59);
        instance.set(Calendar.SECOND, 59);
        Date endTime = instance.getTime();
        /**
         * 格式化时间
         */
        String format1 = simpleDateFormat.format(endTime);
        System.out.println("endTime = " + format1);

        /**
         * 设置时间的偏移量
         */
        instance.add(Calendar.DAY_OF_MONTH, -7);
        instance.add(Calendar.SECOND, 1);
        Date startTime = instance.getTime();
        System.out.println("startTime = " + simpleDateFormat.format(startTime));
    }
}
