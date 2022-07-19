package cn.simplelife.homework.testextends;

public class Employee extends Person {
    private String work;

    public void work() {
        System.out.println(getName() + "摸鱼中");
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
