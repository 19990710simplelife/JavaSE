package cn.simplelife.homework._09traffic;

/**
 * 交通工具类
 */
public class Seater {
    private String brand;//品牌

    public Seater(String brand) {
        this.brand = brand;
    }

    public Seater() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Seater{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
