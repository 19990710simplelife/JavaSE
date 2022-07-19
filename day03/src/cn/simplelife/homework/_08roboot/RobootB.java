package cn.simplelife.homework._08roboot;

public class RobootB extends Roboot implements ISee {
    @Override
    public void see() {
        System.out.println("我能识别图像");
    }

    @Override
    public void walk() {
        System.out.println("我能走路");
    }
}
