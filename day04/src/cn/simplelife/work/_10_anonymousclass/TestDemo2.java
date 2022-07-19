package cn.simplelife.work._10_anonymousclass;

public class TestDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("小张", "18");
        Student student2 = new Student("小li", "18");
        /**
         * 匿名内部类
         */
        IFoundAble iFoundAble = new IFoundAble() {
            @Override
            public String findHouseAble(String size, String money) {
                return "老师找到的房子大小：" + size + " 房子价格：" + money;
            }
        };

        student1.rentHouse(iFoundAble, "小楼", "1000");
        /**
         * 第二种写法
         */

        student2.rentHouse(new IFoundAble() {
            @Override
            public String findHouseAble(String size, String money) {
                return "老师找到的房子大小：" + size + " 房子价格：" + money;
            }
        }, "别墅", "1000");
    }
}
