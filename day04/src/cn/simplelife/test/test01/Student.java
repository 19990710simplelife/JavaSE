package cn.simplelife.test.test01;

public class Student {
    private double midScore;
    private double endScore;
    private double synthesize;

    public Student() {
    }

    public Student(double midScore, double endScore, double synthesize) {
        this.midScore = midScore;
        this.endScore = endScore;
        this.synthesize = synthesize;
    }

    public double getMidScore() {
        return midScore;
    }

    public void setMidScore(double midScore) {
        this.midScore = midScore;
    }

    public double getEndScore() {
        return endScore;
    }

    public void setEndScore(double endScore) {
        this.endScore = endScore;
    }

    public double getSynthesize() {
        return synthesize;
    }

    public void setSynthesize(double synthesize) {
        this.synthesize = synthesize;
    }

    @Override
    public String toString() {
        return "Student{" +
                "midScore=" + midScore +
                ", endScore=" + endScore +
                ", synthesize=" + synthesize +
                '}';
    }
}
