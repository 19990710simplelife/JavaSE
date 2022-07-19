package cn.simplelife._03_singletonlazy;

/**
 * 单例模式-懒汉式
 * 只有被用到的时候才创建对象
 */
public class LazySingleton {
    // 创建一个私有静态当前对象的变量，不初始化
    private static LazySingleton lazySingleton = null;

    // 私有化构造器
    private LazySingleton() {
    }
    //提供公共的方法，用于返回当前私有的对象

    public static LazySingleton getLazySingleton() {
        // 实例不存在创建实例对象
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        // 返回实例对象
        return lazySingleton;
    }

    /**
     * 打印数组的工具
     *
     * @param arr 一个int类型的数组
     */
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
