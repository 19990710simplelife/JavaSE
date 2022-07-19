package cn.simplelife.work._05transfer;

import cn.simplelife.work._03extends_duotai.Animal;
import cn.simplelife.work._03extends_duotai.Cat;
import cn.simplelife.work._03extends_duotai.Dog;

public class TransferTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Cat);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Object);
        Dog dog = (Dog) a;
        dog.shut();
    }
}
