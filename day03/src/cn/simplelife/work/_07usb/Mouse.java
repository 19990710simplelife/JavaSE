package cn.simplelife.work._07usb;

/**
 * 鼠标类
 */
public class Mouse implements IUSB {

    public void mouseWork() {
        System.out.println("鼠标正在移动");
    }

    @Override
    public void swapData() {
        mouseWork();
    }
}
