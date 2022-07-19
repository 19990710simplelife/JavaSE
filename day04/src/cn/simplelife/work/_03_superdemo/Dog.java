package cn.simplelife.work._03_superdemo;

public class Dog extends Animal {
    private String strain; //品种

    public Dog(String name, int health, String strain) {
        super(name,health);
        this.strain = strain;
//        setName(name);
//        setHealth(health);
    }

    @Override
    public void print() {
        System.out.println("name:" + getName());
        System.out.println("health:" + getHealth());
        System.out.println("strain:" + strain);
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
