package cn.simplelife.work._01_scoped;

public class ScopedDemo {
    static int a;//成员变量

    public void test() {
        int b = 0;//局部变量
        System.out.println(a);
        //System.out.println(b); //如果b没有初始化，直接打印b会报错，因为b是局部变量没有初始值。

    }

    public static void main(String[] args) {
        System.out.println(a);
//        System.out.println(b); //不能访问局部变量
    }
}
