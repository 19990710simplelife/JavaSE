package cn.simplelife.homework._05_product;

public class TestDemo {
    public static void main(String[] args) {
        Item item = new Item("666", "戴尔(DELL) 游戏笔记本");
        item.setType("游戏");
        item.setPrice(5499.00);
        Item item1 = new Item("007", "苹果（Macbook pro）笔记本");
        item1.setType("电脑,办公");
        item1.setPrice(18000.00);
        System.out.println("名称：" + item.getName() + " ,价格：" + item.getPrice());
        System.out.println("名称：" + item1.getName() + " ,价格：" + item1.getPrice());
        System.out.println("总数量："+Item.totalNum);
    }
}
