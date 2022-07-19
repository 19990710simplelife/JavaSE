package cn.simplelife.work._08_anonymousclass;

/**
 * 其中一个中介继承中介类并实现其中找房子的抽象方法
 */
public class LianaAgent extends Agent {
    @Override
    public String findHouseAble(String size, int money) {
        return "房子大小：" + size + "房子价格" + money;
    }
}
