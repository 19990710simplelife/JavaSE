package cn.simplelife.homework.testextends;

public class Student extends Person {
    private int StuNo;

    public void study() {
        System.out.println(getName() + "爱学Java");
    }

    public int getStuNo() {
        return StuNo;
    }

    public void setStuNo(int stuNo) {
        StuNo = stuNo;
    }
}
