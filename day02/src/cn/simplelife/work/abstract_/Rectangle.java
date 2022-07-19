package cn.simplelife.work.abstract_;

public class Rectangle extends AbstractGraph{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArey() {
        return width * height;
    }
}
