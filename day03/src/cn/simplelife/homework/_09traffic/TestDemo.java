package cn.simplelife.homework._09traffic;

public class TestDemo {
    public static void main(String[] args) {
        //调用出租车的run方法，打印“出租车开始跑了”,
        IRun run = new Taxi();
        IFly fly = new Airliner();
        ISwim swim = new Ship();
        Taxi taxi = (Taxi) run;
        taxi.setBrand("捷达");
        Airliner airliner = (Airliner) fly;
        airliner.setBrand("波音");
        Ship ship = (Ship) swim;
        ship.setBrand("泰但尼克号");
        run.run();
        System.out.println("---------------");
        //调用飞机的fly方法，打印“飞机开始飞天了”,
        fly.fly();
        System.out.println("---------------");
        //调用客船的swim方法，打印“船舶开始在海洋中漂泊了”，
        swim.swim();
        System.out.println("---------------");
        System.out.println("我是大众" + taxi.getBrand() + "有");
        taxi.manned();
        System.out.println("---------------");
        System.out.println("我是" + airliner.getBrand() + "飞机有");
        taxi.manned();
        System.out.println("---------------");
        System.out.println("我是" + ship.getBrand() + "有");
        taxi.manned();
    }
}
