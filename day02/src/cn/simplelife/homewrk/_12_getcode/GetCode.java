package cn.simplelife.homewrk._12_getcode;

import java.util.Random;

public class GetCode {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",};
        String[] arr2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] arr3 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(arr[random.nextInt(27)]);
        }
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(arr2[random.nextInt(27)]);
        }
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(arr3[random.nextInt(11)]);
        }

        System.out.println(stringBuilder);
    }
}
