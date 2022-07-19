package cn.simplelife.homework.journey;

public class Sandmonk extends Prentice {
    private String sandRiver;

    public void pickUpLuge() {
        System.out.println(getName() + "挑着担儿~~~");
    }

    public String getSandRiver() {
        return sandRiver;
    }

    public void setSandRiver(String sandRiver) {
        this.sandRiver = sandRiver;
    }
}
