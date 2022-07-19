package cn.simplelife.work.extends_;

public class Person {
    private String name;
    private int age;

    public void sleep() {
        System.out.println("下班了，不卷了！");
    }

    /**
     * 展示信息
     */
    public void showInfo() {
        System.out.println("姓名:" + getName() + "\n" + "年龄:" + getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name=" + name + " age=" + age + "}";
    }
}
