package cn.simplelife.work._06_final;

/**
 * 父类被final修饰不能被继承
 */
public class Car extends MotoVehicle {
    public void test() {
        super.run();
    }
}
