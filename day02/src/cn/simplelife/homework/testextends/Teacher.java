package cn.simplelife.homework.testextends;

public class Teacher extends Person {
    private String level;

    public void teach() {
        System.out.println(getName() + "上课中");
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
