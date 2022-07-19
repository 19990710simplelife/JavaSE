package cn.simplelife.homework._05_stringhomework;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String str = "qwertyuizxcvbnm";
        //1、返回字符串长度
        System.out.println(str.length());
        //2、返回指定索引位置的字符串
        System.out.println(str.charAt(0));
        //3、返回指定字符串的索引位置
        System.out.println(str.indexOf("wer"));
        //4、比较字符串内容是否相同
        System.out.println("sdas".equals(str));
        //5、忽略大小写比较字符串是否相同
        System.out.println("KKNJDB".equalsIgnoreCase(str));
        //6、将字符串中的小写字母转为大写
        System.out.println(str.toUpperCase());
        //7、将字符串中的大写转为小写
        System.out.println("SKAHkkh".toLowerCase());
        //8、截取字符串
        System.out.println(str.substring(12));
        System.out.println(str.substring(1, 4));
        //9、去除字符串前后空格
        System.out.println(" akshf ".trim());
        //10、返回切割字符串后的数组
        System.out.println(Arrays.toString(str.split(",")));
    }
}
