package cn.simplelife.work._03_superdemo;

/**
 * super关键字调用构造器注意事项：
 * 1、当父类提供了有参和无参构造器的时候，子类的无参构造器默认调用父类的无参构造器
 * 2、当父类没有无参构造器，且提供了其他有参构造器的时候，子类的无参构造器要求必须调用父类的任意有参构造器
 * 3、子类必须调用一次父类的构造器
 */
public class Cat extends Animal {

    private String sex; //性别

    public Cat() {
        super("",10);
    }

    public Cat(String name, int health, String sex) {
        //调用父类的有参构造器
        super(name, health);
        this.sex = sex;
//        setName(name);
//        setHealth(health);
    }


    @Override
    public void print() {
//        System.out.println("name:" + getName());
//        System.out.println("health:" + getHealth());
        /**
         * 调用父类中没有被private修饰的成员
         */
        super.print();
        System.out.println("sex:" + sex);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
