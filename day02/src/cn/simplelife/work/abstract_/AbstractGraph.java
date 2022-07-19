package cn.simplelife.work.abstract_;

/**
 * 这是一个抽象类
 * 特点:
 * 1、抽象类不能创建自身的对象，但是可以通过匿名内部类来实现
 * 2、抽象类中可以有抽象方法也可以有普通方法
 * 3、抽象类必须有子类，并且子类必须实现抽象类中的抽象方法
 */

public abstract class AbstractGraph {
    /**
     * 抽象方法只能放在抽象类中
     *
     * @return
     */
    public abstract double getArey();
}