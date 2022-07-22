package cn.simplelife.homewrk._06_calendarhomework;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
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
        System.out.println(time);
        getMyTime(instance);
        System.out.println("--------------------------------");
        instance.add(Calendar.YEAR, 10);
        instance.add(Calendar.MONTH, 2);
        instance.add(Calendar.DAY_OF_MONTH, 1);
        /**
         * 直接设置时间
         */
        instance.set(Calendar.HOUR_OF_DAY, 23);
        instance.set(Calendar.MINUTE, 59);
        instance.set(Calendar.SECOND, 59);
        getMyTime(instance);
    }

    /**
     * 封装打印时间的方法
     *
     * @param instance 一个日历对象
     */
    public static void getMyTime(Calendar instance) {
        //获取年
        System.out.println(instance.get(Calendar.YEAR));
        //获取月
        System.out.println(instance.get(Calendar.MONTH) + 1);
        //获取日
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //获取时
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));
        //获取分
        System.out.println(instance.get(Calendar.MINUTE));
        //获取秒
        System.out.println(instance.get(Calendar.SECOND));
    }
}
