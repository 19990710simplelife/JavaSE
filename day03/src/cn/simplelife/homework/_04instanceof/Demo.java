package cn.simplelife.homework._04instanceof;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
        dog.shut();
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Object);
    }
}
