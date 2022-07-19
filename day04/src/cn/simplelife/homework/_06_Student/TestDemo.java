package cn.simplelife.homework._06_Student;

public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student(1001, "张三", 100);
        Student student1 = new Student(1001, "张三", 80);
        Student student2 = new Student(1001, "张三", 100);
        Student student3 = new Student(1001, "张三", 100);
        Student[] students = {student, student1, student2, student3};
        System.out.println(Student.getAvg(students));
    }
}
