package cn.simplelife.work._01_this;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("tom", 18);
        Dog dog1 = new Dog("tom", 18,"藏獒");
        dog.sayHi();
        dog1.sayHi();
    }
}
