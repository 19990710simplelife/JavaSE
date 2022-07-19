package cn.simplelife.work._08_anonymousclass;

/**
 * 这是一个中介类
 */
public abstract class Agent {
    /**
     * 定义一个抽象方法，用于找房子
     *
     * @param size  房子的大小
     * @param money 房子的价格
     * @return 返回找到的房子
     */
    public abstract String findHouseAble(String size, int money);
}
