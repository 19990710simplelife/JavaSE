package cn.simplelife.work._02_thisdemo;

public class Cat extends Animal {

    private String sex; //性别

    public Cat() {
    }

    public Cat(String name, int health, String sex) {
        this.sex = sex;
        setName(name);
        setHealth(health);
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
