package cn.simplelife.work._04_static;

public class TestDmo {
    public static void main(String[] args) {
        int totalCount = 0;
        Car car = new Car("宝马","1000000");
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(Car.count);
    }
}
