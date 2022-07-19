package cn.simplelife.homework.carsystem;

/**
 * 客车类
 */
public class PassengerCar extends AbstractCar {
    private int seatNum;
    private String brand;
    private double dayPrice;

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    @Override
    public double getMoney(int day) {
        double totalprice = 0.0;
        if (seatNum <= 16) {
            dayPrice = 800;
            totalprice = dayPrice * day;
        } else if (seatNum > 16) {
            dayPrice = 1500;
            totalprice = dayPrice * day;
        }
        return totalprice;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "seatNum=" + seatNum +
                ", brand='" + brand + '\'' +
                ", day_price=" + dayPrice +
                '}';
    }
}
