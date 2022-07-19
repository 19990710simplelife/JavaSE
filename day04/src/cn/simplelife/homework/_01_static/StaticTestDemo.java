package cn.simplelife.homework._01_static;

public class StaticTestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // 访问非静态变量
        dog.say();
        dog.setAge(18);
        System.out.println(dog.getAge());
        // 访问静态变量
        Dog.name = "加菲猫";
        System.out.println(Dog.name);
        Dog.shut();
    }
}
