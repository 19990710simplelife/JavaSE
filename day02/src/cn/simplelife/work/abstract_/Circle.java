package cn.simplelife.work.abstract_;

public class Circle extends AbstractGraph {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArey() {
        return 3.14 * r * r;
    }
}
