package cn.simplelife.work._11_stringbuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 767, 878};
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            if (i == arr.length - 1) {
                str += item + "]";
            } else {
                str += item + ",";
            }
        }
        System.out.println(str);
    }
}
