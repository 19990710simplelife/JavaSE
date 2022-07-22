package cn.simplelife.homewrk._06_regex;

public class RegexDemo {
    public static void main(String[] args) {
        // 判断一个字符串是否全部由数字组成
        boolean matches1 = "4".matches("\\d");
        boolean matches0 = "234".matches("\\d?");
        boolean matches2 = "2334".matches("\\d*");
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
