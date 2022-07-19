package cn.simplelife.homework._09traffic;

public class Airliner extends Seater implements IFly {
    @Override
    public void fly() {
        System.out.println("飞机开始飞天了");
    }

    @Override
    public void manned() {
        System.out.println("载客行为");
    }

}
