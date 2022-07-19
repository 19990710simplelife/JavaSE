package cn.simplelife.homework.carsystem;

/**
 * 轿车类
 */
public class Car extends AbstractCar {
    private String type;
    private double dayPrice;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", day_price=" + dayPrice +
                '}';
    }

    @Override
    public double getMoney(int day) {
        double totalprice = 0.0;
        if (type.equals("1")) {
            type = "别克商务舱GL8";
            dayPrice = 600;
            totalprice = dayPrice * day;
        }
        if (type.equals("2")) {
            type = "宝马550i";
            dayPrice = 500;
            totalprice = dayPrice * day;
        }
        if (type.equals("3")) {
            type = "别克林荫大道";
            dayPrice = 300;
            totalprice = dayPrice * day;
        }
        return totalprice;
    }
}
