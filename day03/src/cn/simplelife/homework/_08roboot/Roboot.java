package cn.simplelife.homework._08roboot;

public class Roboot {
    private String name;
    private String model;

    public Roboot(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Roboot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
