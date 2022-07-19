package cn.simplelife.work.override_;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("飞起来的小鸟！！");
    }
}
