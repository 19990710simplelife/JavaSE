package cn.simplelife.homework.testabstract;

public class TestDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.getArea());
        System.out.println("---------------------");
        Rectangle rectangle = new Rectangle(10, 50);
        System.out.println(rectangle.getArey());
        circle.sayHello();
    }
}
