package cn.simplelife.homework._01interfacetest;

public class Frog extends Animal implements ISwimable, IWalkable {

    @Override
    public void swim() {
        System.out.println("青蛙游啊游");
    }

    @Override
    public void walk() {
        System.out.println("青蛙不会跳");
    }
}
