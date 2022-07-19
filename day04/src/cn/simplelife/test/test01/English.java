package cn.simplelife.test.test01;

public class English extends Student {
    private double speech;

    public English(double midScore, double endScore, double synthesize, double speech) {
        super(midScore, endScore, synthesize);
        this.speech = speech;
    }

    public double getSpeech() {
        return speech;
    }

    public void setSpeech(double speech) {
        this.speech = speech;
    }

    @Override
    public String toString() {
        return "English{" +
                "speech=" + speech +
                '}';
    }
}
