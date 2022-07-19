package cn.simplelife.homework._01_statichomework;

/**
 * 静态工具类
 * 核心思想：私有化构造器，不能让外部其他类创建对象，利用static的特点来修饰对应的工具类
 * 需要使用的时候-可以使用类名称.方法名来调用该类中的方法
 */
public class StaticArrayUtils {

    /**
     * 私有化构造器，防止外部创建该类的对象实例
     */
    private StaticArrayUtils() {
    }

    /**
     * 提供一个静态遍历三维数组的方法，供外部使用
     *
     * @param arr 一个三维维数组
     */
    public static void getItemInArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                }
            }
        }
    }

}
