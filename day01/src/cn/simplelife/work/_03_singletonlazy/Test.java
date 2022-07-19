package cn.simplelife.work._03_singletonlazy;

public class Test {
    public static void main(String[] args) {
        LazySingleton.getLazySingleton().printArray(new int[]{1, 2, 3, 4, 5, 4, 6});
    }
}
