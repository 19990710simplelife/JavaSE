package cn.simplelife.work._02_thisdemo;

public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("萨摩耶1号", 100, "萨摩耶");
        Cat cat=new Cat("tom",10000,"女");
        dog.print();
        System.out.println("---------------------------------");
        cat.print();
    }
}
