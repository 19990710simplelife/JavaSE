package cn.simplelife.work._07_innerclass;

import jdk.nashorn.internal.ir.CallNode;

public class Test01 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        /**
         * 如果内部类是静态的，就可以直接创建一个内部类对象
         */
        Outer.Inner inner = new Outer.Inner();
        /**
         * 如果内部类不是静态的，只能通过外部类类名.内部类.成员变量名称访问。
         */
        System.out.println(Outer.Inner.SEX_MAN);
    }
}
