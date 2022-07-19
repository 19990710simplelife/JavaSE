package cn.simplelife.work._02_class;

public class CatTest {
    public static void main(String[] args) {
        //1、创建对象的语法
        //类名 变量名 = new 类名();
        Cat cat = new Cat();
        //2、匿名对象,没有名称也就没有其他引用关系
        new Cat();
        //3、操作对象的字段
        cat.name = "小花";
        cat.age = 1;
        cat.showInfo();
        System.out.println(cat);
    }
}
