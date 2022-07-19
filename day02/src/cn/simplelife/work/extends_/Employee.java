package cn.simplelife.work.extends_;

public class Employee extends Person{
    private String joinTime;

    public void work() {
        System.out.println(getName()+"打工人~~~");
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }
}
