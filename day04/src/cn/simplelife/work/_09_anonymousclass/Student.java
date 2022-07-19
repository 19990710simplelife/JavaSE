package cn.simplelife.work._09_anonymousclass;

public class Student {
    private String name;
    private String age;

    public void study() {
        System.out.println("我爱学习");
    }

    public void rentHouse(IFoundAble house) {
        System.out.println(house.findHouseAble());
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
