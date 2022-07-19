package cn.simplelife.homework._08roboot;

public class RobootC extends Roboot implements ISee, ISpeak {
    @Override
    public void see() {
        System.out.println("我能识别图像");
    }

    @Override
    public void walk() {
        System.out.println("我能走路");
    }

    @Override
    public void speak() {
        System.out.println("我能说话");
    }
}
