package cn.simplelife.homework._06_interfaceusb;

public class Mouse implements IUSB {
    public void oldInsatll() {
        System.out.println("鼠标正在安装。。。。");
    }

    @Override
    public void insatll() {
        oldInsatll();
    }
}
