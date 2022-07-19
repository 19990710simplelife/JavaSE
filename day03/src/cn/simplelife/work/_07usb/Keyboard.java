package cn.simplelife.work._07usb;

public class Keyboard implements IUSB {

    public void keyboardWork() {
        System.out.println("键盘正在输入~~");
    }

    @Override
    public void swapData() {
        keyboardWork();
    }
}
