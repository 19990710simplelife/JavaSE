package cn.simplelife.homework._02_singletonhomework._01_singleton;

/**
 * 单例模式-饿汉式
 * 核心思想:确保内存中只能存在一个该类的实例对象
 * 步骤：
 * 1、私有化构造器、防止外部类使用的时候创建对象
 * 2、事先创建好一个对象使用private static final 修饰使其不能够被修改
 * 3、提供一个公共的静态方法、返回我们已经创建好的对象给外部使用
 */
public class Singleton {
    /**
     * 事先创建好一个对象，
     * 使用static修饰用于给静态方法访问
     * 使用private修饰使其私有化、不能被其他类访问
     * 使用final修饰、使其内存地址不能被修改
     */
    private static final Singleton SINGLETON = new Singleton();

    /**
     * 私有化构造器
     */
    private Singleton() {
    }

    /**
     * 提供一个静态的方法，用于返回单例模式的实例对象
     *
     * @return 一个不可修改的实例对象
     */
    public static Singleton getInstance() {
        return SINGLETON;
    }

    /**
     * 提供一个静态遍历三维数组的方法，供外部使用
     *
     * @param arr 一个三维维数组
     */
    public  void getItemInArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                }
            }
        }
    }
}
