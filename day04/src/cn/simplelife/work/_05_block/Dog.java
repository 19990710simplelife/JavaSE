package cn.simplelife.work._05_block;

public class Dog {
    private String name;
    private int age;
    private int count = 0;

    // 静态代码块
    static {
        System.out.println("我是静态代码块~~~");
    }

    // 构造器代码块
    {
        System.out.println("我是构造代码块！！");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Dog() {
        System.out.println("我是无参构造器~~");
    }

    public void showInfo() {
        System.out.println(name);
        System.out.println(age);
        int count = 1;
        //普通代码块
        {
            int count1 = 1;
            System.out.println(this.count);
            System.out.println(count);
            System.out.println(count1);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
