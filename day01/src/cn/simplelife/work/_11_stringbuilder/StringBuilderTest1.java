package cn.simplelife.work._11_stringbuilder;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        // 1、测试长度问题
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());
        System.out.println("stringBuilder.length() = " + stringBuilder.length());

        stringBuilder = new StringBuilder(50);
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());
        System.out.println("stringBuilder.length() = " + stringBuilder.length());

        stringBuilder = new StringBuilder("abcde");
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());
        System.out.println("stringBuilder.length() = " + stringBuilder.length());

        stringBuilder.append("123").append("456").append("hello");
        System.out.println(stringBuilder);

        stringBuilder.insert(5, "aa");
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);

        pringArray(new int[]{1, 2, 3, 4});
    }

    //1、使用StringBuilder打印数组
    public static void pringArray(int[] arr) {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]).append(", ");
        }
        str.delete(str.length() - 2, str.length());
        str.append("]");
        System.out.println(str);
    }
}
