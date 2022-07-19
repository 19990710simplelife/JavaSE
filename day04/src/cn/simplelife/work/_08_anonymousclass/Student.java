package cn.simplelife.work._08_anonymousclass;

public class Student {
    private String name;
    private String age;
    private Agent agent;

    public void study() {
        System.out.println("我爱学习");
    }

    public void firehouse(String size, int money) {
        String houseAble = agent.findHouseAble(size, money);
        System.out.println("找到一个" + houseAble);
    }

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
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

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
