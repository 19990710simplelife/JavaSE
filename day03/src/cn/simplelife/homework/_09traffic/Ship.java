package cn.simplelife.homework._09traffic;

public class Ship extends Seater implements ISwim {
    @Override
    public void swim() {
        System.out.println("船舶开始在海洋中漂泊");
    }

    @Override
    public void manned() {
        System.out.println("载客行为");
    }

}
