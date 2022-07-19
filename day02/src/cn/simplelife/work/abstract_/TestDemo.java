package cn.simplelife.work.abstract_;

public class TestDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArey());
        System.out.println(circle.getArey());
    }
}
