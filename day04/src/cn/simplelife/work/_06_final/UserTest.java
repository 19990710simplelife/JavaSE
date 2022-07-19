package cn.simplelife.work._06_final;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("张三", "1315641", User.SEX_MAN);
        User user1 = new User("李四", "1315641", User.SEX_WOMAN);
        User user2 = new User("王麻子", "1315641", User.SEX_SECRECY);
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
    }
}
