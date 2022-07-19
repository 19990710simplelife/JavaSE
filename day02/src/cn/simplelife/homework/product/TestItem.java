package cn.simplelife.homework.product;

public class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item("666", "戴尔(DELL)游戏笔记本");
        item1.setType("游戏");
        item1.setPrice(5499.00);
        System.out.println(item1);
        System.out.println("------------------------------");
        Item item2 = new Item("666", "戴尔(DELL)游戏笔记本");
        item2.setType("电脑,办公");
        item2.setPrice(18000.00);
        System.out.println(item2);
    }
}
