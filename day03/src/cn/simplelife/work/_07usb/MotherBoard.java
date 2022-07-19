package cn.simplelife.work._07usb;

import cn.simplelife.work._06usb.Keyboard;
import cn.simplelife.work._06usb.Mouse;

/**
 * 这是主板类
 */
public class MotherBoard {
    /**
     * 接收符合USB规范的设备
     *
     * @param iusb
     */
    public void plugin(IUSB iusb) {
        iusb.swapData();
    }
}
