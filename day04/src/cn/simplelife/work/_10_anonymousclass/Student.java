package cn.simplelife.work._10_anonymousclass;

public class Student {
    private String name;
    private String age;

    public void study() {
        System.out.println("我爱学习");
    }

    public void rentHouse(IFoundAble house, String size, String money) {
        System.out.println(house.findHouseAble(size, money));
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
}
