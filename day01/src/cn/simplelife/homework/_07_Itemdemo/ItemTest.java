package cn.simplelife.homework._07_Itemdemo;

public class ItemTest {
    public static void main(String[] args) {
        String text = "name：移动硬盘；price：58.0";
        String[] split = text.split("；");//name：移动硬盘 price：58.0
        String[] name = split[0].split("：");
        String itemName = name[1];
        String[] price = split[1].split("：");
        double itemPrice = Double.parseDouble(price[1]);
        ItemDemo itemDemo = new ItemDemo();
        itemDemo.setName(itemName);
        itemDemo.setPrice(itemPrice);
        System.out.println(itemDemo);
    }
}
