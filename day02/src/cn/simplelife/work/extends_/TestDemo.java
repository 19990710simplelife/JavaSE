package cn.simplelife.work.extends_;

public class TestDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Employee employee = new Employee();
        teacher.setName("张三");
        teacher.setAge(18);
        teacher.setLevel("教授");
        teacher.showInfo();
        teacher.teach();
    }
}
