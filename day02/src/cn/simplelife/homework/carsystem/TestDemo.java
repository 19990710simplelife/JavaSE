package cn.simplelife.homework.carsystem;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //定义一个int类型的变量表示客户要租的车型
        int typeCode;
        System.out.println("请输入选择的车型代号(1、轿车、2、客车):");
        while (input.hasNext()) {
            typeCode = input.nextInt();
            //选择租客车
            if (typeCode == 1) {
                //输入要租的客车车型
                System.out.println("请输入租车型号的代号( 1、别克商务舱GL8 | 2、宝马550i | 3、别克林荫大道):");
                // 创建一个客车对象
                Car car = new Car();
                //设置用户选择的客车车型
                car.setType(input.next());
                //输入要租的天数
                System.out.println("输入租车天数:");
                //计算租金
                System.out.println("租金是：" + car.getMoney(input.nextInt()));
                //输出订单信息
                System.out.println(car);
            } else if (typeCode == 2) {//选择的是客车
                PassengerCar passengerCar = new PassengerCar();
                System.out.println("请选择客车品牌：(1、金杯 2、金龙)");
                if (input.nextInt() == 1) {
                    passengerCar.setBrand("金杯");
                } else if (input.nextInt() == 2) {
                    passengerCar.setBrand("金龙");
                }
                System.out.println("请输入租车的座位数:");
                passengerCar.setSeatNum(input.nextInt());
                System.out.println("输入租车天数:");
                System.out.println("租金是：" + passengerCar.getMoney(input.nextInt()));
                System.out.println(passengerCar);
            }
            System.out.println("输入选择的的车型代号（1.轿车 2.客车）");
        }
    }
}
