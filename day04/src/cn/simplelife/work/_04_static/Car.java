package cn.simplelife.work._04_static;

public class Car {
    /**
     * 这是实例成员
     */
    private String brand;//品牌
    private String price;//价格
    static int count;//总数

    public Car() {
        //类目.变量名进行方法静态变量
        Car.count++;
    }

    public Car(String brand, String price) {
        this.brand = brand;
        this.price = price;
        Car.count++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
