package cn.simplelife._02_singleton;

/**
 * 单例模式
 * 整个JVM中只能存在一个对象
 */
public class Singleton {
    /**
     * 2、自己提供一个对象（采用字段,静态,最终），供外部使用
     */
    private static final Singleton singleton = new Singleton();

    /**
     * 1、私有化构造器（防止其他类中创建对象）
     */
    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
