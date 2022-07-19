package cn.simplelife.homework.testabstract;

public class Circle extends AbstractGraph {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}
