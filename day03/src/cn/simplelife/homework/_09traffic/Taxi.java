package cn.simplelife.homework._09traffic;

/**
 * 出租车类
 */
public class Taxi extends Seater implements IRun {

    @Override
    public void manned() {
        System.out.println("载客行为");
    }

    @Override
    public void run() {
        System.out.println("出租车开始跑了");
    }
}
