package cn.simplelife.work._05_regex;

public class RegexTest {
    public static void main(String[] args) {
        // 判断一个字符串是否全部由数字组成
        boolean matches1 = "4".matches("\\d");      //有且只能一个数字
        boolean matches0 = "234".matches("\\d?");   //没有或有且只能一个
        boolean matches2 = "2334".matches("\\d*");  //零个或多个
        System.out.println("matches0 = " + matches0);
        System.out.println("matches1 = " + matches1);
        System.out.println("matches2 = " + matches2);
        //手机号
        System.out.println("-------------------------------");
        System.out.println("13772647051".matches("0?(13|14|15|17|18|19)[0-9]{9}"));

        //身份证号
        System.out.println("6103281999075241h".matches("\\d{17}[0-9|X]"));
        //判断一个字符串的是否是6-16位
        System.out.println("dffvzfs".matches("[a-zA-Z]\\w{5,15}"));
    }
}
