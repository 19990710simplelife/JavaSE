package cn.simplelife.homework._07_duotaitest;

public class Student implements Person {
    @Override
    public void think() {
        System.out.println("我能思考！");
    }

    @Override
    public void study() {
        System.out.println("我能学习");
    }

    @Override
    public void eat() {
        System.out.println("我能吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("我能睡觉");
    }

    @Override
    public void breathe() {
        System.out.println("我能呼吸");
    }
}
