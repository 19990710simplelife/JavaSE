package cn.simplelife.work._03extends_duotai;

public class Test {
    public static void main(String[] args) {
        // 创建animal对象
        Animal animal = null;
        // 利用多态接收猫的对象
        animal = new Cat();
        // 调用猫类中的方法
        animal.shut();
        // 利用多态接受狗的对象
        animal = new Dog();
        // 调用子类狗中的方法
        animal.shut();
    }
}
