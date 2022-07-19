package cn.simplelife.work._02_class;

/**
 * 这是一个猫类
 * 1、类名定义规则：首字母大写、驼峰命名法
 * 2、定义名字、年龄等字段，字段名命名规则：字母小写后续单词采用驼峰命名法
 */
public class Cat {
    String name;
    int age;

    /**
     * 打印猫的名字和年龄
     */
    public void showInfo() {
        System.out.println("名字" + name + "年龄" + age);
    }
}
