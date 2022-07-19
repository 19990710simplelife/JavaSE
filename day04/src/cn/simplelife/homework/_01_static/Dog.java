package cn.simplelife.homework._01_static;

public class Dog {
     static String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("你好！");
    }

    public static void shut() {
        System.out.println("汪汪汪！！！");
    }
}
