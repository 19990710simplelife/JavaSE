package cn.simplelife.work._01_this;


public class Dog {
    private String name;
    private int age;
    private String type;

    public Dog() {
    }

    /**
     * 使用this调用成员变量，解决成员变量和局部变量的二义性问题
     *
     * @param name 局部变量name
     * @param age  局部变量age
     */
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 使用this访问构造器
     *
     * @param name
     * @param age
     * @param type
     */
    public Dog(String name, int age, String type) {
        this(name, age);
        this.type = type;
    }

    public void showInfo() {
        System.out.println("我是" + this.name);
        System.out.println("我今年" + this.age + "岁了！！！");
        System.out.println("我是"+this.type+"狗");
    }

    /**
     * 使用this调用其他的成员方法
     */
    public void sayHi() {
        this.showInfo();
        System.out.println("你是狗吗？");
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
