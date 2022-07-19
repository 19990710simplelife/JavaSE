package cn.simplelife.homework._02_final;

public class TestDemo {
    public static void main(String[] args) {
        final Teacher teacher = new Teacher("张三", 10);
        //teacher = new Teacher(); 被final修饰的变量不能再次修改引用地址
        final int a = 1;
        //a=2;//变量的值不可 在变
    }
}
