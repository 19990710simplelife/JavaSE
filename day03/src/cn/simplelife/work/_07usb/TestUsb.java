package cn.simplelife.work._07usb;

public class TestUsb {
    public static void main(String[] args) {
        //创建鼠标对象
        MotherBoard motherBoard = new MotherBoard();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        motherBoard.plugin(mouse);
        motherBoard.plugin(keyboard);
    }
}
