package cn.simplelife.homework;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        Person person1 = new Person("张三", 18);
        System.out.println(person == person1);
        System.out.println(person.equals(person1));
        System.out.println(person);
    }
}
