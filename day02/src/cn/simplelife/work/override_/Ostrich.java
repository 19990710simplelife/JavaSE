package cn.simplelife.work.override_;

public class Ostrich extends Bird {

    /**
     * 重写父类的方法
     */
    public void fly() {
        System.out.println("大笨鸟，飞不起来~~~");
        super.fly();
    }

}
