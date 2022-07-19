package cn.simplelife.homework._06_interfaceusb;

public class KeyBoard implements IUSB {
    public void oldInsatll() {
        System.out.println("键盘正在安装。。。。");
    }

    @Override
    public void insatll() {
        oldInsatll();
    }
}
