package cn.simplelife.homework._06_Student;

public class Student {
    private int no;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int no, String name, double score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static double getAvg(Student[] students) {
        double sum = 0;
        double avgScore;
        for (Student student : students) {
            sum += student.getScore();
        }
        avgScore = sum / students.length;
        return avgScore;
    }
}
