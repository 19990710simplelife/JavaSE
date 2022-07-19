package cn.simplelife.homework.journey;

public class Prentice {
    private String name;
    private String age;
    private String weapon;

    public void buddha() {
        System.out.println("上班了，开始撞钟~~");
    }

    public void doPilgrimage() {
        System.out.println("今天又是陪师傅取经的一天");
    }

    public void fight() {
        System.out.println("小妖精，快快受死");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
