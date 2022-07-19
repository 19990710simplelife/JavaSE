package cn.simplelife.homework._02duotai_extends_test;

public class TestDemo {
    public static void main(String[] args) {
        // 利用父类接收猫的对象 形成多态
        Animal animal = new Cat();
        // 调用猫类中的方法
        animal.shut();
        animal = new Dog();
        // 调用狗类中的方法
        animal.shut();
    }
}
