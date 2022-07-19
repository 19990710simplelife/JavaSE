package cn.simplelife.work._08_anonymousclass;

public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student("小刘", "18");
        /**
         * 此处使用的是实例内部类
         */
        student.setAgent(new LianaAgent());
        student.firehouse("100", 10);
    }
}
