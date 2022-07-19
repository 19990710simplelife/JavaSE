package cn.simplelife.homework._02_singletonhomework._02_singletonlazy;

import cn.simplelife.homework._02_singletonhomework._01_singleton.Singleton;

/**
 * 单例模式-懒汉式，先不创建对象，在需要使用的时候创建对象
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getSingletonLazy() {
        // 判断内存中是否有该对象，没有就new一个
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        //有就直接返回
        return singletonLazy;
    }

    /**
     * 提供一个静态遍历三维数组的方法，供外部使用
     *
     * @param arr 一个三维维数组
     */
    public void getItemInArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                }
            }
        }
    }

}
