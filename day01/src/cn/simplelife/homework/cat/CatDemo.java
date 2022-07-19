package cn.simplelife.homework.cat;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(18);
        cat.setColor("grey");
        System.out.println("姓名-->"+cat.getName());
        System.out.println("年龄-->"+cat.getAge());
        System.out.println("颜色-->"+cat.getColor());
        System.out.println(cat.toString());
        cat.speack();
    }
}
