package cn.simplelife.work._02simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        // 替换规则
        simpleDateFormat.applyPattern("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(simpleDateFormat.format(date));
        try {
            Date parse = simpleDateFormat.parse("2022年07月21日 14时00分00秒");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
