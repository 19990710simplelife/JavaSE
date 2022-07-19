package cn.simplelife.homework.journey;

public class Pig extends Prentice {
    private String wife;

    public void holdHourse() {
        System.out.println(getName()+"我牵着马儿~");
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}
