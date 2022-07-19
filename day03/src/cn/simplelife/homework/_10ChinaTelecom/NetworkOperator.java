package cn.simplelife.homework._10ChinaTelecom;


public class NetworkOperator {
    private String type;

    public void installBroadband() {
        System.out.println("安装宽带");
    }

    public void installCableTV() {
        System.out.println("安装有线电视");
    }

    public NetworkOperator() {
    }

    public NetworkOperator(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NetworkOperator{" +
                "type='" + type + '\'' +
                '}';
    }
}
