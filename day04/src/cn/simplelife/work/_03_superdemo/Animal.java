package cn.simplelife.work._03_superdemo;

public class Animal {
    private String name;
    private int health;

//    public Animal() {
//    }

    public Animal(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void print() {
        System.out.println("name:" + name);
        System.out.println("health:" + health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
