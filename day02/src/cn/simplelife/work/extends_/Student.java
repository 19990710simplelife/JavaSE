package cn.simplelife.work.extends_;

public class Student extends Person{

    private int stuNo;

    public void study() {
        System.out.println(getName()+"我爱学java");
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }
}
