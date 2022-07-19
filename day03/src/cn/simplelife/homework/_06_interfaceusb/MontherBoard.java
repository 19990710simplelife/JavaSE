package cn.simplelife.homework._06_interfaceusb;

/**
 * 主板类
 */
public class MontherBoard {
    /**
     * 安装各种符合usb接口的设备
     *
     * @param iusb
     */
    public void plugin(IUSB iusb) {
        iusb.insatll();
    }
}
