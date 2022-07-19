package cn.simplelife.work._09_anonymousclass;

public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student("小刘", "18");

        /**
         * 这是一个局部内部类定义在方法之中
         */
        class Teacher implements IFoundAble {
            private String size;
            private String money;

            public Teacher(String size, String money) {
                this.size = size;
                this.money = money;
            }

            @Override
            public String findHouseAble() {
                return "老师找到的房子大小：" + size + " 房子价格：" + money;
            }
        }
        student.rentHouse(new Teacher("小楼", "10"));
    }
}
