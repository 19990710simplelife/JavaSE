package cn.simplelife.work._01_staticutils;

/**
 * 饿汉式单例模式
 */
public class StaticArrayUtils {

    /**
     * 私有化构造器，防止外部创建对象
     */
    private StaticArrayUtils() {
    }

    public static void printArray(int[] arr) {
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
