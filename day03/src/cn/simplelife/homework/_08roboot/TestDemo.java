package cn.simplelife.homework._08roboot;

public class TestDemo {
    public static void main(String[] args) {
        ISpeak A = new RobootA();
        A.speak();
        ISee B = new RobootB();
        RobootC C = new RobootC();
        B.see();
        C.see();
        C.speak();
    }
}
