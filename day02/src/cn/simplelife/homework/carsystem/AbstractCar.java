package cn.simplelife.homework.carsystem;

/**
 * 这是一个抽象类用于获取租金
 */
public abstract class AbstractCar {

    /**
     * 计算租金
     *
     * @param day 租赁天数
     * @return
     */
    public abstract double getMoney(int day);
}
