package cn.simplelife.homework._06_interfaceusb;


public class TestDemo {
    public static void main(String[] args) {
        MontherBoard montherBoard = new MontherBoard();
        Mouse mouse = new Mouse();
        KeyBoard keyboard = new KeyBoard();
        montherBoard.plugin(mouse);
        montherBoard.plugin(keyboard);
    }
}
