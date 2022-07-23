package cn.simplelife.homework.test;

public class TestDemo {
    public static void main(String[] args) {
        char[] arr = {'A', '1', 'R', '!', 'e', '&', 'A', '5', 'A', 'g', '#', 'D'};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                total++;
            }
        }
        System.out.println(total);

    }
}
