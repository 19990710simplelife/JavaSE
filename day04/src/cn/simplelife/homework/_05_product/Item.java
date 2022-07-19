package cn.simplelife.homework._05_product;

public class Item {
    private String code;
    private String name;
    private String type;
    private double price;
    static int totalNum;

    public Item() {
        totalNum++;
    }

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
        totalNum++;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
