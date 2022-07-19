package cn.simplelife.homework._07_user;

public class TestDemo {
    public static void main(String[] args) {
        User user0 = new User(1001, "123456");
        User user1 = new User(1002, "123456");
        User user2 = new User(1003, "123456");
        User user3 = new User(1004, "123456");
        System.out.println("用户总人数:" + User.total);

//        int[] arr = {0, 15, 0, 15, 45, 2, 1, 0, 3, 4};
//        int count = 0;
//        int newArrIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                count++;
//            }
//        }
//        int[] newArr = new int[arr.length - count];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                newArr[newArrIndex] = arr[i];
//                newArrIndex++;
//            }
//        }
//        for (int value : newArr) {
//            System.out.println(value);
//        }
    }
}
