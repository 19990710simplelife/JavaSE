package cn.simplelife._02_singleton;

public class SingletonArrayUtils {

    private static final SingletonArrayUtils SINGLETON_ARRAY_UTILS = new SingletonArrayUtils();

    private SingletonArrayUtils() {
    }

    public static SingletonArrayUtils getSingletonArrayUtils() {
        return SINGLETON_ARRAY_UTILS;
    }

    public void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("参数类型错误！");
        } else {
            String str = "[";
            for (int i = 0; i < arr.length; i++) {
                str += arr[i];
                if (i == arr.length - 1) {
                    str += "]";
                } else {
                    str += ",";
                }
            }
            System.out.println(str);
        }
    }

}
