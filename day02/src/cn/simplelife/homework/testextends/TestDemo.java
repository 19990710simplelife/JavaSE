package cn.simplelife.homework.testextends;

public class TestDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Employee employee = new Employee();
        teacher.setName("hahhha");
        teacher.setAge(0);
        teacher.setLevel("幼儿园");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getLevel());
        teacher.teach();
    }
}
