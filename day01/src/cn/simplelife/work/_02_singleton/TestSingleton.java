package cn.simplelife.work._02_singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton0 = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        SingletonArrayUtils.getSingletonArrayUtils().printArray(new int[]{1, 2, 3, 4, 5, 4, 6});
    }
}
