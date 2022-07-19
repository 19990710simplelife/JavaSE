package cn.simplelife.homework._08roboot;

public class RobootA extends Roboot implements ISpeak {
    @Override
    public void speak() {
        System.out.println("我能说话");
    }

    @Override
    public void walk() {
        System.out.println("我能走路");
    }
}
