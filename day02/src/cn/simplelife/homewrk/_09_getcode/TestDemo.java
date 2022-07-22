package cn.simplelife.homewrk._09_getcode;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(getCpCode(80, "北京市"));
    }

    public static String getCpCode(double orderFee, String province) {
        if (orderFee > 128 || "广东省".equals(province)) {
            return "SF";
        } else if (orderFee > 58 && "北京市".equals(province)) {
            return "EMS";
        } else {
            return "ZTO";
        }
    }
}
